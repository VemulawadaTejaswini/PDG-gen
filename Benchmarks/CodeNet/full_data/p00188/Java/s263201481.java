import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    int n = s.nextInt();
	    if(n == 0) break;
	    int[] dat = new int[n];
	    for(int i = 0; i < n; ++i) {
		dat[i] = s.nextInt();
	    }
	    int target = s.nextInt();
	    int l, r;
	    l = 0; r = dat.length-1;
	    int cnt = 0;
	    while(l <= r) {
		++cnt;
		int m = (l+r)/2;
		if(dat[m] == target) break;
		else if(dat[m] < target) l = m+1;
		else r = m-1;
	    }
	    System.out.println(cnt);
	}
    }
}