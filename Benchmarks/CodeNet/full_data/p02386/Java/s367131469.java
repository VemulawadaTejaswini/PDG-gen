import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      Dice[] aDices = new Dice[n];

      for ( int i=0; i<n; i++ )
        aDices[i] = new Dice(br.readLine().split(" "));

      String result = "Yes";
      for ( int i=0; i<n-1; i++ ) {
        for ( int j=i+1; j<n; j++ )
        if(!aDices[i].isSame(aDices[j])) continue;
        else { result = "No"; break; }
      }

      System.out.println(result);
    }
  }
}

class Dice {
  private int[] side;

  public Dice( int[] ia ) {
    side = Arrays.copyOf(ia, ia.length);
  }
  public Dice( String[] s ) {
    side = new int[s.length];
    for ( int i=0; i < 6; i++)
      side[i] = Integer.parseInt(s[i]);
  }

  @Override
  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof Dice)) return false;
    Dice r = (Dice) o;

    if(
      (side[0] == r.side[0]) &&
      (side[1] == r.side[1]) &&
      (side[2] == r.side[2]) &&
      (side[3] == r.side[3]) &&
      (side[4] == r.side[4]) &&
      (side[5] == r.side[5])
      ) return true;
    else return false;
  }

  public int getUpperSide() {
    return side[0];
  }
  public int getLowerSide() {
    return side[5];
  }
  public int getFrontSide() {
    return side[1];
  }
  public int getBackSide() {
    return side[4];
  }
  public int getRightSide() {
    return side[2];
  }
  public int getLeftSide() {
    return side[3];
  }

  public boolean isSame(Dice d) {

    d.setFrontPosition(this.getFrontSide());

    for(int i=0; i<4; i++)  {
      for(int j=0; j<4; j++) {
        if( this.equals(d) ) return true;
        else d.rotate("W");
      }
      d.rotate("N");
    }

    return false;
  }

  public void setFrontPosition(int n) {
    for(int i=0; i < 3; i++){
      if(getUpperSide() != n) rotate("N");
    }
    for(int i=0; i < 3; i++){
      if(getUpperSide() != n) rotate("W");
    }
    rotate("S");
  }

  public int doRotate(String s) {
    for ( int i=0; i < s.length(); i++ ) {
      rotate(s.substring(i, i+1));
    }
    return side[0];
  }

  public void rotate(String o) {
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
    int tmp = side[0];
    side[0] = side[1]; side[1] = side[5]; side[5] = side[4];
    side[4] = tmp;
  }
  private void rotateS() {
    int tmp = side[0];
    side[0] = side[4]; side[4] = side[5]; side[5] = side[1];
    side[1] = tmp;
  }
  private void rotateW() {
    int tmp = side[0];
    side[0] = side[2]; side[2] = side[5]; side[5] = side[3];
    side[3] = tmp;
  }
  private void rotateE() {
    int tmp = side[0];
    side[0] = side[3]; side[3] = side[5]; side[5] = side[2];
    side[2] = tmp;
  }
}
