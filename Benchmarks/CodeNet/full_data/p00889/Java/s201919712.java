
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int N = sc.nextInt(), S = sc.nextInt(), W = sc.nextInt(), Q = sc.nextInt();
			if((N|S|Q|W) == 0) break;
			
			int[] a = new int[N];
			int g = S;
		    for(int i=0; i<N; i++) {
		        a[i] = (g/7) % 10;
		        if( g%2 == 0 ) { g = (g/2); }
		        else           { g = (g/2) ^ W; }
		    }
		    
		    if(Q == 2 || Q == 5) {
		    	int ans = 0;
		    	int z = 0;
		    	for(int i=0;i<N;i++) {
		    		if(a[i] == 0) z++;
		    		if(a[i]%Q == 0) ans += i-z+1;
		    	}
		    	System.out.println(ans);
		    	continue;
		    }
		    int p = 1, prev = 0, ans = 0;
		    int[] cnt = new int[Q]; cnt[0] = 1;
		    for(int i=0;i<N;i++) {
		    	int v = (prev + p * a[N - i-1])%Q;
		    	prev = v;
		    	
		    	if(a[N - i-1] != 0) ans += cnt[v];
		    	cnt[v]++;
		    	
		    	p = (p*10)%Q;
		    }
		    
		    System.out.println(ans);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}