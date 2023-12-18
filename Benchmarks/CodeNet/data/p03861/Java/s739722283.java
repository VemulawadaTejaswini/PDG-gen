import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    int x = sc.nextInt();

    long ans =b/x-(a-1)/x;

    System.out.println(ans);
  }
}
