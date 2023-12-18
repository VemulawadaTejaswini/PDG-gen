import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = (int)Math.ceil(a*100/8.0);
    if (ans/10 != b) {
      ans=-1;
    }
    System.out.println(ans);
  }
}


