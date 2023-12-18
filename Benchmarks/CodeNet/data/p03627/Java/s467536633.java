import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int bar[] = new int[N];
        for(int i=0;i<N;i++) bar[i] = sc.nextInt();
        Arrays.sort(bar);
        
        int edge1 = 0;
        int edge2 = 0;
        
        for(int i=N-1;i>0;i--){
        	if(bar[i]==bar[i-1]){
        		if(edge1==0){
        			edge1 = bar[i];
        			i--;
        		}
        		else{
        			edge2 = bar[i];
        			break;
        		}
        	}
        }
        System.out.println(edge1 * edge2);
    }
}