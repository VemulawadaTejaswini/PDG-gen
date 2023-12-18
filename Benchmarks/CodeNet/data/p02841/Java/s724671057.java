import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w1 = sc.nextInt();
    int d1 = sc.nextInt();
    int w2 = sc.nextInt();
    int d2 = sc.nextInt();
    int ans = 0;
    
    if(w1!=w2){
      ans = 1;
    }

    System.out.println(ans);
    
  }
}