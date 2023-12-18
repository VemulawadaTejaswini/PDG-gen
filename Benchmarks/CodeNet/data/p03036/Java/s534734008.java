import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = c;
    
    for(int i=1;i<=10;i++){
      System.out.println(a*d-b);
      d = a*d-b;
    }
  }
}