import java.util.Scanner;

public class Watch{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int h = S/3600;
    S = S%3600;
    int m = S/60;
    int t = S % 60;
   
    System.out.println(h+":"+m+":"+t);
  }
}