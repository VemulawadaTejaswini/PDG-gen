import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = a*n;
    if(x>b){
      System.out.println(b);
    }else{
      System.out.println(x);
    }
  }
}
