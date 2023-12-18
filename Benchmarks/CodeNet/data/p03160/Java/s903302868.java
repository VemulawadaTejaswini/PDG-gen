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
     int [] cost = new int[N+1];
     cost[0]=0;
     cost[1]=array[0];
     for(int i=2;i<=N;i++) { 
       cost[i] = Math.min(Math.abs(cost[i-1]-cost[i]), Math.abs(cost[i-2]-cost[i]));
     }
    System.out.println(cost[N]);
       
         
  }
    
    