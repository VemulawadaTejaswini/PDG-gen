import java.util.Scanner;

public class Main(){
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(n==1 ? "Hello World" : a+b);
  }
}