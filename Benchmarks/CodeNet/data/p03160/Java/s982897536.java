import java.util.*;
import java.io.*;

public class Main {
  
   public static void main(String []abc){
      Main sol = new Main();
      sol.solve();
   }
  
  private void solve() {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     long [] array = new long [N];
     for(int i=0;i<N;i++) {
        array[i] = sc.nextLong();
     }
     long [] cost = new long[N+1];
     cost[0]=0;
     cost[1]=array[0];
     if (N==1) return cost[1];     
     cost[2] = Math.abs(array[0]-array[1]);
     if (N==2) return cost[2];
     for(int i=3;i<=N;i++) { 
       cost[i] = cost[i-1]+ Math.min(Math.abs(cost[i-1]-cost[i]), Math.abs(cost[i-2]-cost[i]));
     }
    System.out.println(cost[N]);
  }
         
  }
    
    
