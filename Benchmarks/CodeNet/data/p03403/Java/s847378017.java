import java.util.*;
import java.io.*;

public class Main {
    public static int distance(int x, int y){
    	return Math.abs(x-y);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] spot = new int[N+2];
        
        spot[0]=0;
        spot[N+1]=0;
        for(int n=1;n<=N;n++) spot[n]=sc.nextInt();
        
        int normalCost = 0;
        for(int n=0;n<=N;n++) normalCost+=distance(spot[n],spot[n+1]);
        
        
        for(int i=1;i<=N;i++) System.out.println(normalCost-distance(spot[i-1],spot[i])-distance(spot[i],spot[i+1])+distance(spot[i-1],spot[i+1]));
    }
}