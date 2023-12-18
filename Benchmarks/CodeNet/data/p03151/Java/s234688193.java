import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long sumA = 0;
        long[] mapA = new long[N];
        for (int i = 0; i < N; i++) {
        	mapA[i] = sc.nextLong();
        	sumA += mapA[i];
        }
        long sumB = 0;
        long[] mapB = new long[N];
        for (int i = 0; i < N; i++) {
        	mapB[i] = sc.nextLong();
        	sumB += mapB[i];
        }
        
        if (sumA < sumB) {
        	System.out.println(-1);
        	return;
        }
        
        List<C> upper = new ArrayList<>(N);
        List<C> lower = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
        	C c = new C(mapA[i], mapB[i]);
        	upper.add(c);
        	lower.add(c);
        }
        
        Collections.sort(upper);
        Collections.sort(lower);
        Collections.reverse(lower);
        
        long ans = 0;
        int targetIndex = 0;
        C target = lower.get(targetIndex);
        int reIndex = 0;
        C re = upper.get(reIndex);
        while(target.sa < 0) {
        	long sa = re.sa;
        	long plus = sa + target.sa;
        	if (!re.use) {
        		ans++;
        		re.use = true;
        	}
        	
        	if (plus > 0) {
        		re.sa = plus;
        		
        		target.sa = 0;
        		targetIndex++;
        		target = lower.get(targetIndex);
        		
        		ans++;
        	} else if (plus == 0) {
        		re.sa = 0;
        		target.sa = 0;
        		
        		reIndex++;
        		re = upper.get(reIndex);
        		
        		targetIndex++;
        		target = lower.get(targetIndex);
        		
        		ans++;
        	} else {
        		re.sa = 0;
        		reIndex++;
        		re = upper.get(reIndex);
        	}
        }
        
        long sum = 0;
        for (C c: upper) {
        	if (c.calcB() < c.b) {
        		throw new RuntimeException();
        	}
        }
        
        System.out.println(ans);
    }
    
    static class C implements Comparable<C>{
    	long sa;
    	long a;
    	long b;
    	boolean use;
    	
    	C(long a, long b) {
    		this.a = a;
    		this.b = b;
    		this.sa = a - b;
    	}
    	
    	public long calcB() {
    		return this.b + sa;
    	}

		@Override
		public int compareTo(C o) {
			return (int) (o.sa - this.sa);
		}
    }
}