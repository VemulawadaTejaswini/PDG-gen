import java.io.*;

class Dice 
{
  String[] face; 
  int[] num; 
  static final int SURFACE = 6;
  static final int TOP = 0;
  static final int SOUTH = 1;
  static final int EAST = 2;
  static final int WEST = 3;
  static final int NORTH = 4;
  static final int BOTTOM = 5;

  public Dice(String str) 
  {
    this.face = new String[SURFACE];
    this.face = str.split(" ");
    this.num = new int[SURFACE];
    for(int i = 0; i < this.face.length; i++){
      num[i] = Integer.parseInt(face[i]);
    }
  }

  public int get(int n) { return this.num[n]; } 

  public void roll(char way) 
  {
    int tmp;
    switch(way){
      case 'N':
        tmp = num[0];
        this.num[0] = this.num[1];
        this.num[1] = this.num[5];
        this.num[5] = this.num[4];
        this.num[4] = tmp;
        break;
      case 'S':
        tmp = this.num[0];
        this.num[0] = this.num[4];
        this.num[4] = this.num[5];
        this.num[5] = this.num[1];
        this.num[1] = tmp;
        break;
      case 'E':
        tmp = this.num[0];
        this.num[0] = this.num[3];
        this.num[3] = this.num[5];
        this.num[5] = this.num[2];
        this.num[2] = tmp;
        break;
      case 'W':
        tmp = this.num[0];
        this.num[0] = this.num[2];
        this.num[2] = this.num[5];
        this.num[5] = this.num[3];
        this.num[3] = tmp;
        break;
      case 'C': //clockwise
        tmp = this.num[1];
        this.num[1] = this.num[2];
        this.num[2] = this.num[4];
        this.num[4] = this.num[3];
        this.num[3] = tmp;
        break;
      case 'A': //anticlockwise(counterclockwise)
        tmp = this.num[1];
        this.num[1] = this.num[3];
        this.num[3] = this.num[4];
        this.num[4] = this.num[2];
        this.num[2] = tmp;
        break;
      default:
        break;
    }
  }

  public void change(int t, int f) 
  {
    int top = SURFACE;
    int front = SURFACE;

    for(int x = 0; x < this.num.length; x++){
      if(t == num[x]){ //top
        top = x;
      }else if(f == num[x]){ //front
        front = x;
      }
    }

    if(top == SURFACE || front == SURFACE) return;

    switch(top){ 
      case TOP:
        break;
      case SOUTH:
        this.roll('N');
        break;
      case EAST:
        this.roll('W');
        break;
      case WEST:
        this.roll('E');
        break;
      case NORTH:
        this.roll('S');
        break;
      case BOTTOM:
        this.roll('S');
        this.roll('S');
        break;
    }

    while(f != num[SOUTH]){ 
      this.roll('C');
    }
  }

  public static boolean check(Dice d1, Dice d2) 
  {
    int c;

    for(c = 0; c < SURFACE; c++){
      if(d1.num[c] != d2.num[c]){
        break;
      }
    }

    return (c == SURFACE) ? true : false;
  }
}

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine(); 
    Dice dice1 = new Dice(str1);
    String str2 = br.readLine(); 
    Dice dice2 = new Dice(str2);

    int top = Integer.parseInt(dice1.face[0]);
    int front = Integer.parseInt(dice1.face[1]);

    dice2.change(top, front); 

    boolean b = Dice.check(dice1, dice2); 

    if(b == true){
      System.out.println("Yes");
    }else if(b == false){
      System.out.println("No");
    }
  }
}