import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int k = 0;
    int s = 0;
    int n = 0;
    
    int k = scan.nextInt();
    int s = scan.nextInt();
    
    int n = s.length();
    
    if(k <= n){
      System.out.println(s);
    }else{
      System.out.println(s.substring(k) + "…");
    }
  }
}