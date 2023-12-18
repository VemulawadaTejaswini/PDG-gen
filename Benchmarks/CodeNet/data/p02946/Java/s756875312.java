import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int K = s.nextInt();
    int X = s.nextInt();
    for (int i = -K+1; i<K;i++){
      System.out.print(X+i + " ");
    }
  }
}