import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int[] x=new int[scn.nextInt()];
      int ans=0;
      for(int i=0;i<x.length;i++){
          x[i]=scn.nextInt();
      }
      for(int i=x.length-1;i>=0;i--){
        for(int j=i-1;j>=0;j--){
            if(i-j==x[i]+x[j]) {
                ans++;
            }
        }
      }
      System.out.println(ans);
    }
}
