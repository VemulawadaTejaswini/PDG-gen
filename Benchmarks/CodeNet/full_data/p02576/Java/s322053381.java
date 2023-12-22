import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int T = sc.nextInt();
    if(N%X==0){
      System.out.println((N/X)*T);
    } else {
      System.out.println(((N/X)+1)*T);
    }
  }
}