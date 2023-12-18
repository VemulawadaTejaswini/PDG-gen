import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int answer = 0;
    if(k > a + b){
      answer = a - (k - a - b);
    } else {
      answer = Math.min(a,k);
    }
    System.out.println(answer);
  }
}