import java.util.*;

public class Main {
    public static long exec(long f0, long y, int type, double r, long t) {
	long fond = f0;
	if(type == 0) {//tanri
	    long c = 0L;
	    for(int i = 0; i < y; ++i) {
		long B = (long)(fond*r);
		c += B;
		fond = fond - t;
	    }
	    fond += c;
	} else {
	    for(int i = 0; i < y; ++i) {
		long B = (long)(fond*r);
		fond = fond + B - t;
	    }
	}
	return fond;
    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int m = s.nextInt();
	for(int tc = 0; tc < m; ++tc) {
	    long f0 = s.nextLong();
	    long y = s.nextLong();
	    int n = s.nextInt();
	    long ans = 0;
	    for(int i = 0; i < n; ++i) {
		long res = exec(f0,y,s.nextInt(),s.nextDouble(),s.nextInt());
		if(ans < res) ans = res;
	    }
	    System.out.println(ans);
	}
    }
}