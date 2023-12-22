import java.util.Scanner;

class Dice{
  int Top;
  int Bottom;
  int N;
  int S;
  int W;
  int E;
  Dice (int Top, int Bottom, int N, int S, int W, int E){
    Top = this.Top, Bottom = this.Bottom, N = this.N, S = this.S, W = this.W, E = this.E
  }
  public void turnN(){
    int tmp = Top;
    Top = S;
    S = Bottom;
    Bottom = W;
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

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Dice dice = new Dice(stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt(),stdIn.nextInt());
    String direction = stdIn.next();
    for (int i = 0; i < direction.length; i++){
      if (direction.chaAt(i) == 'N'){
        dice.turnN();
      }
      else if (direction.charAt(i) == 'W'){
        dice.turnW();
      }
      else if (direction.charAt(i) == 'E'){
        dice.turnE();
      }
      else {
        dice.turnS();
      }
    }
    System.out.println(dice.Top);
  }
}

