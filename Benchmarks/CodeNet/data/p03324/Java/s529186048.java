import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    
    int num = (int)Math.pow(100,d);
        
    int ans = num * n;
    
    System.out.println(ans);
    
  }
}
