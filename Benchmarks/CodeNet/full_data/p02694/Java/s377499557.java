import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      Long x=scn.nextLong();
      int a=100;
      int ans=0;
      while(a<x){
        a*=1.01;
        ans++;
      }
      System.out.println(ans);
    }
}
