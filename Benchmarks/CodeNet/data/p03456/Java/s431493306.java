import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    a = a + b;
    int n = Integer.parseInt(a);
    for(int i = 1;i<=1000;i++){
      if(n == i*i){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
