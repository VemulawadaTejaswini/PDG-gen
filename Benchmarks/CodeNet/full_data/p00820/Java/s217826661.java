import java.io.*;
import java.util.*;


class Main{
    static int count, n;
    static int[] square = new int[(1<<15)];
    static int[] sqt = new int[(1<<15)];
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	for(int i=0; i<Math.sqrt(1<<15); i++)
	    square[i*i]=1;
	for(int i=0; i<Math.sqrt(1<<15); i++)
	    sqt[i] = i*i;
	try {
	    while(true){
		count = 0;
		n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		for(int i=0; i<Math.sqrt(1<<15) && i*i<=n/2; i++){
		    if(square[n-i*i]==1){
			count++;
		    }
		}
		if(n%8 != 7)
		    rec(1, 0, 0, 3);
		rec(1, 0, 0, 4);
		System.out.println(count);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    private static void rec(int now, int p, int sum, int cas){
    	if(p==cas){
	    if(sum == n)
		count++;
	    return;
	}
	
    	for(int i=now; i<Math.sqrt(1<<15) && sum<=n; i++){
	    sum+=i*i;
	    rec(i, p+1, sum, cas);
	    sum-=i*i;
	}
    }
}