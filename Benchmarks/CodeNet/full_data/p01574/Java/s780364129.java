import java.io.*;
import java.util.*;
 
class Main{
    static int now = 0;
    static int N, M;    
    static int[] L, map;
    static boolean flag = true;
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
	    rep(0, L);
	    if(flag)
		System.out.println("No");
	}catch(Exception e){
            System.out.println("Error");
	}
    }
    static void rep(int n, int[] L){
	if(n==N){
	    System.out.println("Yes");
	    flag=false;
	}
	for(int i=0; i<M; i++){
	    now+=L[i];
	    if(map[now%N]==0){
		map[now%N]=1;
		rep(n+1, L);
		map[now%N]=0;
	    }
	}
    }
}