import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      boolean a[]=new boolean[scn.nextInt()+1];
      int k=scn.nextInt();
      int ans=-1;
      for(int i=0;i<k;i++){
          for(int j=scn.nextInt();j>0;j--){
              a[scn.nextInt()]=true;
          }
      }
      for (int i=0;i<a.length;i++){
          if(!a[i]) ans++;
      }
      System.out.println(ans);
    }
}
