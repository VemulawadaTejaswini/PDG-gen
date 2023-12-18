import java.util.*;
 
public class Main {
	static long count = 0;
	static long loop = 0;
	static long loo = 0;
	static long count2 = 0;
	static Set<Integer> res = new HashSet<Integer>();
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long K = sc.nextLong();
    	int[] trp = new int[N + 1];
    	for (int i = 1; i <= N; i++) {
    		int Ai = sc.nextInt();
    		trp[i] = Ai;
    	}
    	res.add(trp[1]);
    	mcn(trp[1], trp, K);
    }
    
    private static int mcn(int num, int[] trp, long K) {
    	count++;
    	loop++;
    	if (res.contains(trp[num])) {
    		loo = K%loop;
    		mcn2(trp[1], trp, loo);
    	}
    	res.add(trp[num]);
    	if (count == K) {
    		System.out.println(trp[num]);
    		System.exit(0);
    	}
    	return mcn(trp[num], trp, K);
    }
    
    private static int mcn2(int num, int[] trp, long K) {
    	if (count2 == K) {
    		System.out.println(trp[num]);
    		System.exit(0);
    	}
    	count2++;
    	loop++;
    	return mcn(trp[num], trp, K);
    }
}