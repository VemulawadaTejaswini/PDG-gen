import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int[] x=new int[scn.nextInt()+1];
      int ans=0;
      for(int i=1;i<x.length;i++){
          x[i]=scn.nextInt();
      }
      for(int i=x.length-1;i>=1;i--){
        for(int j=i-1;j>=1;j--){
            if(i-j<x[i]||i-j<x[j]) continue;
            if(x[i]+x[j]==i-j)   ans++;
        }
      }
      System.out.printf("%d\n",ans);
    }
}
