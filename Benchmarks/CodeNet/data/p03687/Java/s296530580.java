import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int slen = s.length();
	int ans = 1000;
	for(int i = 0; i<slen; i++) {
	    char mark = s.charAt(i);
	    int curlen = slen;
	    char[] curr = s.toCharArray();
	    int locnt = 0;
	    while(curlen > 0 && !isSame(curlen, curr)) {
		for(int j = 0; j<curlen-1; j++) {
		    if(curr[j] == mark || curr[j+1] == mark) curr[j] = mark;
		}
		locnt++;
                curlen--;
	    }
	    ans = Math.min(locnt, ans);
	}
	System.out.println(ans);
    }

    public static boolean isSame(int curlen, char[] curr) {
	char mark = curr[0];
	for(int i = 1; i<curlen; i++) if(curr[i]!=mark) return false;
	return true;
    }
}

