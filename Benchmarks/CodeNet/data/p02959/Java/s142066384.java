import java.util.*;

public class Main{

  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ms = new int[n+1];
        int[] hs = new int[n];

        for(int i=0;i<n+1;i++){
            ms[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            hs[i] = sc.nextInt();
        }

        int tot = 0;
        int min = Math.min(ms[n],hs[n-1]);
        ms[n] -= min;
        hs[n-1] -= min;
        tot += min;

        for(int i = n-1;i>0;i--){
            min = Math.min(ms[i],hs[i]);
            ms[i] -= min;
            hs[i] -= min;
            tot += min;

            min = Math.min(ms[i],hs[i-1]);
            ms[i] -= min;
            hs[i-1] -= min;
            tot += min;
        }

        min = Math.min(ms[0],hs[0]);
        ms[0] -= min;
        hs[0] -= min;
        tot += min;
      
        System.out.println(tot);



        sc.close();
    }
 
}