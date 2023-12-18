import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();//横
    int y = scan.nextInt();//縦
    int Sx,Sy;
    int xx = 1;
    int yy = 1;
    int answer = 0;

    while(xx <= x && yy <= y){
      answer++;
      xx++;
      yy++;
    }
    xx = 3;
    yy = 1;
    Sx = xx;
    while(xx <= x){
      while(xx <= x && yy <= y){
        answer++;
        xx++;
        yy++;
      }
      Sx = Sx + 2;
      xx = Sx;
      yy = 1;
    }
    xx = 1;
    yy = 3;
    Sy = yy;
    while(yy <= y){
      while(xx <= x && yy <= y){
        answer++;
        xx++;
        yy++;
      }
      Sy = Sy + 2;
      xx = 1;
      yy = Sy;
    }
    System.out.println(answer);
  }
}
