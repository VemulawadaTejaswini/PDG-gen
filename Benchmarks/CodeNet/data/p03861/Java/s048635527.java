
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = b - a;
    int N = c + 1;

    int x = sc.nextInt();

    int count = 0;

    for(int i = 0; i < N;i++){
      if((c % x == 0) && (c != 0)){
       count = count + 1;
      }
      c = c + 1;
    }

    System.out.println(count);

  }
}