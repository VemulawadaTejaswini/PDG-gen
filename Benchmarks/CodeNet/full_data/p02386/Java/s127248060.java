import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Dice
{
  int[] face; //input
  int[] num;  //state
  static final int SURFACE = 6;
  static final int TOP = 0;
  static final int SOUTH = 1;
  static final int EAST = 2;
  static final int WEST = 3;
  static final int NORTH = 4;
  static final int BOTTOM = 5;

  public Dice(String str) //??????????????????
  {
    String[] s = str.split(" ");
    face = new int[SURFACE];
    num = new int[SURFACE];
    for(int i = 0; i < s.length; i++){
      num[i] = Integer.parseInt(s[i]);
      face[i] = Integer.parseInt(s[i]);
    }
  }

  public void reset() //??¢????????????????????????
  {
    for(int i = 0; i < face.length; i++){
      num[i] = face[i];
    }
  }

  public int getValue(int index) //index?????¢???????????????
  {
    if(0 <= index && index < num.length){
      return num[index];
    }else{
      return -1;
    }
  }

  public int getIndex(int value) //value?????¢???index?????????
  {
    for(int i = 0; i < num.length; i++){
      if(value == num[i]) return i;
    }
    return -1;
  }

  public void roll(String command) //roll???command????????°?????¨???
  {
    for(int i = 0; i < command.length(); i++){
      roll(command.charAt(i));
    }
  }

  public void roll(char way) //?????????????????¢?????????
  {
    int tmp;
    switch(way){
      case 'N':
        tmp = num[TOP];
        num[TOP] = num[SOUTH];
        num[SOUTH] = num[BOTTOM];
        num[BOTTOM] = num[NORTH];
        num[NORTH] = tmp;
        break;
      case 'S':
        tmp = num[TOP];
        num[TOP] = num[NORTH];
        num[NORTH] = num[BOTTOM];
        num[BOTTOM] = num[SOUTH];
        num[SOUTH] = tmp;
        break;
      case 'E':
        tmp = num[TOP];
        num[TOP] = num[WEST];
        num[WEST] = num[BOTTOM];
        num[BOTTOM] = num[EAST];
        num[EAST] = tmp;
        break;
      case 'W':
        tmp = num[TOP];
        num[TOP] = num[EAST];
        num[EAST] = num[BOTTOM];
        num[BOTTOM] = num[WEST];
        num[WEST] = tmp;
        break;
      default:
        break;
    }
  }

  public void turn() //roll anticlockwise
  {
    roll("ESW");
  }

  public void top(int index) //index?????¢???top?????????
  {
    if(index == -1) return; //top??????????????¢?????????????????????

    switch(index){ //top?????????????????´
      case TOP: //TOP
        break;
      case SOUTH: //SOUTH
        roll('N');
        break;
      case EAST: //
        roll('W');
        break;
      case WEST:
        roll('E');
        break;
      case NORTH:
        roll('S');
        break;
      case BOTTOM:
        roll("SS");
        break;
    }
  }
}

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); //number
    Dice[] dice = new Dice[n]; //dice
    for(int i = 0; i < n; i++){
      String str = br.readLine();
      dice[i] = new Dice(str);
    }

    boolean check = true; //?????????true

    for(int i = 1; i < n; i++){
      for(int j = 0; j < i; j++){
          check = check_2(dice[i], dice[j]); //??????
          if(check);
          else
            break;
      }
      if(check);
      else
        break;
    }

    if(check)
      System.out.println("Yes");
    else
      System.out.println("No");
  }

  public static boolean check_2(Dice d1, Dice d2)
  {
    for(int i = 0; i < d1.face.length; i++){ //dice1????????¢?????¨???check
      d1.reset();
      d1.top(i);
      int index = d2.getIndex(d1.getValue(Dice.TOP));
      if(index == -1){
        continue;
      }else {
        d2.top(index);
        for(int j = 0; j < 4; j++){
          d2.turn();
          if(Arrays.equals(d1.num, d2.num)){ //???????????£??????false
            return false;
          }
        }
      }
    }
    return true; //?????£??????true
  }

}