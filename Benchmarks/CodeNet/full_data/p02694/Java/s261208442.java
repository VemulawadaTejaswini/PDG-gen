import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int x=scn.nextInt();
      int a=100;
      int ans=0;
      while(a<x){
        a*=1.01;
        ans++;
      }
      System.out.printf("%d\n",ans);
    }
}
