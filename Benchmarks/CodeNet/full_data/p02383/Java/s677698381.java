import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      String[] diceNumStr;
      int[] diceNum = new int[6+1];
      while(true) {

        if( (line = br.readLine()) == null || line.isEmpty() ) break;

        diceNumStr = line.split(" ");
        for ( int i=0; i < 6; i++)
          diceNum[i+1] = Integer.parseInt(diceNumStr[i]);

        Dice dice1 = new Dice(diceNum);
        System.out.println(dice1.doRotate(br.readLine()));
      }
    }
  }
}

class Dice {
  private int[] side;

  public Dice( int s1, int s2, int s3, int s4, int s5, int s6 ) {
    side = new int[]{ 0,s1,s2,s3,s4,s5,s6 };
  }
  public Dice( int[] s ) {
    side = Arrays.copyOf(s, s.length);
  }

  public int getUpSideNum() {
    return side[1];
  }

  public int doRotate(String s) {
    for ( int i=0; i < s.length(); i++ ) {
      rotate(s.substring(i, i+1));
    }
    return side[1];
  }

  private void rotate(String o) {
    switch(o) {
      case "N" :
        rotateN();
        break;
      case "S" :
        rotateS();
        break;
      case "W" :
        rotateW();
        break;
      case "E":
        rotateE();
        break;
      default :
    }
  }

  private void rotateN() {
    int tmp = side[1];
    side[1] = side[2]; side[2] = side[6]; side[6] = side[5];
    side[5] = tmp;
  }
  private void rotateS() {
    int tmp = side[1];
    side[1] = side[5]; side[5] = side[6]; side[6] = side[2];
    side[2] = tmp;
  }
  private void rotateW() {
    int tmp = side[1];
    side[1] = side[3]; side[3] = side[6]; side[6] = side[4];
    side[4] = tmp;
  }
  private void rotateE() {
    int tmp = side[1];
    side[1] = side[4]; side[4] = side[6]; side[6] = side[3];
    side[3] = tmp;
  }
}
