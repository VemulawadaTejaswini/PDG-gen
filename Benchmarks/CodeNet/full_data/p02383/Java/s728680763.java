import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Dice dice = new Dice(stdIn.nextInt() ,stdIn.nextInt() ,stdIn.nextInt() ,stdIn.nextInt() ,stdIn.nextInt() ,stdIn.nextInt());
    String direction = stdIn.next();
    for (int i = 0; i < direction.length(); i++){
      if (direction.charAt(i) == 'N'){
        dice.TurnN();
      }
      else if (direction.charAt(i) == 'W'){
        dice.TurnW();
      }
      else if (direction.charAt(i) == 'E'){
        dice.TurnE();
      }
      else {
        dice.TurnS();
      }
    }
    System.out.println(dice.Top);
  }
}

class Dice{
  int Top;
  int Bottom;
  int N;
  int S;
  int W;
  int E;
  Dice (int a, int b, int c, int d, int e, int f){
    Top = a;
    S = b;
    E = c;
    W = d;
    N = e;
    Bottom = f;
  }
  public void TurnN(){
    int tmp = Top;
    Top = S;
    S = Bottom;
    Bottom = N;
    N = tmp;
  }
  public void TurnW() {
    int tmp = Top;
    Top = E;
    E = Bottom;
    Bottom = W;
    W = tmp;
  }
  public void TurnE() {
    int tmp = Top;
    Top = W;
    W = Bottom;
    Bottom = E;
    E = tmp;
  }
  public void TurnS() {
    int tmp = Top;
    Top = N;
    N = Bottom;
    Bottom = S;
    S = tmp;
  }
}

