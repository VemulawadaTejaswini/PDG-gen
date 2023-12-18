import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int nc = N;
	int digit = 0;
	int cnt = 0;
	while(nc!=0) {
	    nc = nc/10;
	    digit++;
	}
	int max = (int)Math.pow(3,digit+1);
	digit = 3;
	for(int i = 0; i<max; i++) {
	    if(i==Math.pow(3,digit)) {
		i = 1;
		digit++;
	    }
	    int n10 = i;
	    int n3 = 0;
	    int d = 1;
	    int dc =digit;
	    StringBuilder builder = new StringBuilder();
	    while(dc>0) {
		n3 = n10%3*d + n3;
		builder.insert(0,n10%3);
		d *= 10;
		n10 = n10/3;
		dc--;
	    }
	    int decode = decode753(builder.toString());
	    if(N >= decode && decode > 0) {
		cnt++;
	    }
	}
	System.out.println(cnt);
    }
    public static int decode753 ( String n3 ) {
	int d = 0;
	int digit = 10;
	int[] array = {7,5,3};
	int[] haveArray = {0,0,0};
	int cnt = 0;
	while(cnt < n3.length()){
	    char c = n3.charAt(cnt);
	    if(c == '0') {
		d = digit*d + 7;
		haveArray[0]++;
	    } else if( c == '1' ) {
		d = digit*d + 5;
		haveArray[1]++;
	    } else {
		d = digit*d + 3;
		haveArray[2]++;
	    }
	    cnt++;
	}
	if(haveArray[0] > 0 && haveArray[1] > 0 && haveArray[2] > 0) {
	    return d;
	} else {
	    return -1;
	}
    }
}