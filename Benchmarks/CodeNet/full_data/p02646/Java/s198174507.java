import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    
    int oni = a + v*t;
    int nige = b + w*t;
    
    if(oni=nige){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
}