import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        ArrayList<Integer>[] graphLink = new ArrayList[N];
        for(int n=0;n<N;n++) graphLink[n] = new ArrayList<Integer>();
        
        for(int m=0;m<M;m++){
        	int A = sc.nextInt()-1;
        	int B = sc.nextInt()-1;// index fix
        	graphLink[A].add(B);
        	graphLink[B].add(A);
        }
        
        int[] ichimatsu = new int[N];
        for(int n=1;n<N;n++) ichimatsu[n]=0;
        ichimatsu[0]=1;
        /*paint the vertices
        //same color as vertex 0: ichimatsu[i] = 1
        //different color from v1:ichimatsu[i] = 2
        //not checked yet:        ichimatsu[i] = 0
        */

        LinkedList<Integer> unchecked = new LinkedList<Integer>();
        unchecked.add(0);
        while(!unchecked.isEmpty()){
        	int v1 = unchecked.removeFirst();
        	for(int v:graphLink[v1]){
        	    int newColor = 3 - ichimatsu[v1];
        	    if(ichimatsu[v]+newColor==3){//find an odd loop
        	        int ans = N * (N-1) /2 - M;
        	        System.out.println(ans);
        	        System.exit(0);
        	    }else if(ichimatsu[v]==0){
        	        unchecked.add(v);
        	        ichimatsu[v] = newColor;
        	    }
        	}
        }
        int color1 = 0;
        int color2 = 0;
        for(int n=0;n<N;n++){
        	if(ichimatsu[n]==1) color1++;
        	else color2++;
        }
        int ans = color1*color2-M;
        System.out.println(ans);
    }
}