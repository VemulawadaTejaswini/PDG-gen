import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		int range = rui(N) / N;
		int pposi = 0;
		List<Integer> zumip = new ArrayList<Integer>();
		
		for(int i = 0; i < N-1; i++) {
		    p[i] = sc.nextInt();
		    int pcount = 0;
		    for(int j = 1; j <= N; j++) {
		        if(zumip.contains(j)) {
		            continue;
		        }else if(j == p[i]) {
		            pposi += pcount * range + 1;
		            zumip.add(j);
		        }
		        pcount++;
		    }
		    range = range / (N-i-1);
		}
		p[N-1] = sc.nextInt();
		
		int[] q = new int[N];
		range = rui(N) / N;
		int qposi = 0;
		List<Integer> zumiq = new ArrayList<Integer>();

		for(int i = 0; i < N-1; i++) {
		    q[i] = sc.nextInt();
		    int qcount = 0;
		    for(int j = 1; j <= N; j++) {
		        if(zumiq.contains(j)) {
		            continue;
		        }else if(j == q[i]) {
		            qposi += qcount * range + 1;
		            zumiq.add(j);
		        }
		        qcount++;
		    }
		    range = range / (N-i-1);
		}
		
		if(pposi > qposi) {
		    System.out.println(pposi - qposi);
		}else {
		    System.out.println(qposi - pposi);
		}
	}
	
	static int rui(int a) {
	    if(a == 1) {
	        return 1;
	    }else {
	        return a * rui(a-1);
	    }
	}
}
