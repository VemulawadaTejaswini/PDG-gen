import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    long ans =b/x-a/x;
    if(a%x==0) {
    ans+=1;
    }

    System.out.println(ans);
  }
}