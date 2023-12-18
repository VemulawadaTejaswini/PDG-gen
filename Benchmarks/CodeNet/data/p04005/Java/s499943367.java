import java.util.Scanner;

public class Main {
  static final long INF = Long.MAX_VALUE / 2;
  static int a, b, c;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();

    long S = a * b;
    long ans = INF;

    if(c % 2 == 0){
      ans = 0;
    }
    else{
      ans = Math.min(ans, S);
    }

    S = b * c;
    if(a % 2 == 0){
      ans = 0;
    }
    else{
      ans = Math.min(ans, S);
    }

    S = a * c;
    if(b % 2 == 0){
      ans = 0;
    }
    else{
      ans = Math.min(ans, S);
    }

    System.out.println(ans);
  }
}