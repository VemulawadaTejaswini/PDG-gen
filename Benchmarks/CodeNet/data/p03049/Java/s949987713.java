import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int cnt = 0;
	int a = 0;
	int b = 0;
	int ab = 0;
	for(int i = 0; i<n; i++) {
	    String s = sc.next();
	    cnt += (s.length() - s.replace("AB","").length()) / 2;
	    if(s.charAt(0) == 'B' && s.charAt(s.length()-1) == 'A') ab++;
	    else if(s.charAt(0) == 'B') b++;
	    else if(s.charAt(s.length()-1) == 'A') a++;
	}

	int ans = Math.min(a,b) + ab +cnt;
	if(ab == n) ans = ab -1 +cnt;


	System.out.println(ans);

    }
}