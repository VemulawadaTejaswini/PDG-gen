import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] array = new int[N+1];
        int[] place = new int[N+1];
        for(int n=1;n<=N;n++){
        	array[n] = sc.nextInt();
        	place[array[n]] = n;
        }
        array[0]=0; place[0]=0;
        int max = 0;
        int line = 0;
        
        for(int n=1;n<=N;n++){
        	if(place[n]>place[n-1]){
        	    line++;
        	    max = Math.max(max,line);
        	}else{
        	    line = 1;
        	}
        }
        System.out.println(N-max);
    }
}