import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String a[] = br.readLine().split(" ");
       
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        Set<Integer> set = new HashSet<>();
        int height[] = new int[n];
        a = br.readLine().split(" ");
        int i=0;
        for(String x:a) height[i++] = Integer.parseInt(x);
        
        boolean graph[][] = new boolean[n+1][n+1];
        while(m-->0) {
            String temp = br.readLine();
            a = temp.split(" ");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);
            graph[x][y] = true;
            graph[y][x] = true;
        }
        
        
        for( i=1;i<=n;i++) {
            boolean flag = true;
            boolean canReach = true;
            for(int j=1;j<=n;j++) {
                if(graph[i][j]) {
                    canReach = false;
                    if(height[i-1]<=height[j-1]) {
                        // System.out.println("here");
                        flag = false;break;
                        
                    }
                }
               
            }   
             if(flag||canReach) {set.add(i);}
        }
        System.out.println(set.size());
       
     }
}