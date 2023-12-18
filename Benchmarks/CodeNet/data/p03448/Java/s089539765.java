import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //各硬貨と目標額
    int coinA = sc.nextInt();
    int coinB = sc.nextInt();
    int coinC = sc.nextInt();
    int X = sc.nextInt();
    int calc = 0;
    int answer = 0;
    for (int i=0;i<=coinA;i++){
      for (int j=0;j<=coinB;j++){
        for (int k=0;k<=coinC;k++){
          calc = (500*i) + (100*j) + (50*k);
          if (X == calc){
            answer = answer + 1;
          }
        }
      }
    }
    System.out.println(answer);
  }
}