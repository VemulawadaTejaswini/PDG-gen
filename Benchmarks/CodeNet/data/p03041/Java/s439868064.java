import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    String S = sc.next();
    
    int kMinus = k - 1;
    
    System.out.println(S.substring(0, kMinus) + S.substring(kMinus, k).toLowerCase() + S.substring(k));
  }
}