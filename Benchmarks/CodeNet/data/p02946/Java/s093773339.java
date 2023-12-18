import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int x=sc.nextInt();
    int ans=x-k+1;
    for (int i=0;i<k*2-1;i++) {
      System.out.print(ans+" ");
      ans++;
    }
    System.out.println();
  }
}
