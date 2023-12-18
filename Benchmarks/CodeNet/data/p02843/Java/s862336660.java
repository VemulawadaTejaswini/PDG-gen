import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = N/100;
    int B = N%100;
    System.out.println(B/A > 5 ? 0 : 1);
  }
}