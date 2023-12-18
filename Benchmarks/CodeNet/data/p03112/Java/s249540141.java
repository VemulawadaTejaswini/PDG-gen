import java.util.*;


class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		long[] s = new long[A];
		long[] t = new long[B];
		long[] x = new long[Q];
		for (int i=0;i<A;i++) {
			s[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<B;i++) {
			t[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<Q;i++) {
			x[i]=Long.parseLong(sc.next());
		}

		for (int i=0;i<Q;i++) {
			long dist_1 = 0L;
	    	int result_1 = Arrays.binarySearch(s, x[i]);
	    	int index_1=0;
	    	int index_2=-1;

	    	if (result_1<0) {
	    		if (-result_1-2==-1) {
	    			dist_1=Math.abs(s[-result_1-1]-x[i]);
	    			index_1=-result_1-1;
	    		} else if (-result_1-1==A) {
	    			dist_1=Math.abs(s[-result_1-2]-x[i]);
	    			index_1=-result_1-2;
	    		} else {
	    			dist_1+=Math.min(Math.abs(s[-result_1-2]-x[i]),Math.abs(s[-result_1-1]-x[i]));
	    			if (dist_1==Math.abs(s[-result_1-2]-x[i])) {
	    				index_1=-result_1-2;
	    			} else {
	    				index_1=-result_1-1;
	    			}
	    			if (Math.abs(s[-result_1-2]-x[i])==Math.abs(s[-result_1-1]-x[i])) {
	    				index_2=result_1-1;
	    			}
	    		}
	    	}
	    	int result_t = Arrays.binarySearch(t, s[index_1]);
	    	if (result_t<0) {
	    		if (-result_t-2==-1) {
	    			dist_1+=Math.abs(t[-result_t-1]-s[index_1]);
	    		} else if (-result_t-1==B) {
	    			dist_1+=Math.abs(t[-result_t-2]-s[index_1]);
	    		} else {
	    			long tmp = Math.min(Math.abs(t[-result_t-2]-s[index_1]),Math.abs(t[-result_t-1]-s[index_1]));
	    			if (index_2>=0) {
	    				tmp=Math.min(tmp,Math.abs(t[-result_t-2]-s[index_2]));
	    				tmp=Math.min(tmp,Math.abs(t[-result_t-1]-s[index_2]));
	    			}
	    			dist_1+=tmp;
	    		}
	    	}

			long dist_2 = 0L;
	    	int result_3 = Arrays.binarySearch(t, x[i]);
	    	int index_3=0;
	    	int index_4=-1;
	    	if (result_3<0) {
	    		if (-result_3-2==-1) {
	    			dist_2=Math.abs(t[-result_3-1]-x[i]);
	    			index_3=-result_3-1;
	    		} else if (-result_3-1==B) {
	    			dist_2=Math.abs(t[-result_3-2]-x[i]);
	    			index_3=-result_3-2;
	    		} else {
	    			dist_2+=Math.min(Math.abs(t[-result_3-2]-x[i]),Math.abs(t[-result_3-1]-x[i]));
	    			if (Math.abs(t[-result_3-2]-x[i])<Math.abs(t[-result_3-1]-x[i])) {
	    				index_3=-result_3-2;
	    			} else {
	    				index_3=-result_3-1;
	    			}
	    			if (Math.abs(t[-result_3-2]-x[i])==Math.abs(t[-result_3-1]-x[i])) {
	    				index_4=-result_3-1;
	    			}
	    		}
	    	}
	    	int result_t_2 = Arrays.binarySearch(s, t[index_3]);
	    	if (result_t_2<0) {
	    		if (-result_t_2-2==-1) {
	    			dist_2+=Math.abs(s[-result_t_2-1]-t[index_3]);
	    		} else if (-result_t_2-1==A) {
	    			dist_2+=Math.abs(s[-result_t_2-2]-t[index_3]);
	    		} else {
	    			long tmp = Math.min(Math.abs(s[-result_t_2-2]-t[index_3]),Math.abs(s[-result_t_2-1]-t[index_3]));
	    			if (index_4>=0) {
	    				tmp=Math.min(tmp,Math.abs(s[-result_t_2-2]-t[index_4]));
	    				tmp=Math.min(tmp,Math.abs(s[-result_t_2-1]-t[index_4]));
	    			}
	    			dist_2+=tmp;
	    		}
	    	}
	    	System.out.println(Math.min(dist_1,dist_2));
    	}
	}
}