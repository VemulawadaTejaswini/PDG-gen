import java.io.*;
import java.util.*;
 
class Main{
    static int now = 0;
    static int N, M;    
    static int[] L, map;
    public static void main(String[] args){
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        try{
	    String[] st = sc.readLine().split(" ");
	    N = Integer.valueOf(st[0]); M = Integer.valueOf(st[1]);

	    L = new int[M];
	    map = new int[N];
	    for(int i=0; i<M; i++)
		L[i] = Integer.valueOf(sc.readLine());
	    Arrays.sort(L);
	    if(rep(0, L))
		System.out.println("Yes");
	    else
		System.out.println("No");
	}catch(Exception e){
            System.out.println("Error");
	}
    }
    static boolean rep(int n, int[] L){
	if(n==N){
	    return true;
	}
	for(int i=0; i<M; i++){
	    now+=L[i];
	    if(map[now%N]==0){
		map[now%N]=1;
		if(rep(n+1, L))
		    return true;
		map[now%N]=0;
	    }
	    now-=L[i];
	}
	return false;
    }
}