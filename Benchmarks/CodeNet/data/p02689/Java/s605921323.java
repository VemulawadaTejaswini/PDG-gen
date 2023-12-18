import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      boolean n[]=new boolean[scn.nextInt()+1];
      int h[]=new int[n.length];
      int m=scn.nextInt();
      int ans=0;
      
      for(int i=1;i<h.length;i++){
          h[i]=scn.nextInt();
          n[i]=true;
      }
      for(int i=0;i<m;i++){
          int a=scn.nextInt();
          int b=scn.nextInt();
          if(h[a]<h[b]){
            n[a]=false;
          }else if(h[a]==h[b]){
            n[a]=false;
            n[b]=false;
          }else{
            n[b]=false;
          }
      }
      for (int i=0;i<n.length;i++){
          if(n[i]) ans++;
      }
      System.out.println(ans);
    }
}
