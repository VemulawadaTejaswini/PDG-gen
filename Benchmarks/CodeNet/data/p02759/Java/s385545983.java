import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int cnt=0;
    while(true){
      if(cnt*2<N){
        cnt++;
      }
      else break;
    }
    System.out.printf("%d",cnt);
  }
}