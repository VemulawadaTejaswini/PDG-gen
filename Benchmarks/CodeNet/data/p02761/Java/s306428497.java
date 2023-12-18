import java.util.*;
public class Main {
	private static int[] ans;
  	private static int n;
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	int m = sc.nextInt();

    	ans = new int[n];
    	for (int i = 0; i < n; i++) {
    		ans[i]=-1;
    	}
    	for (int i = 0; i < m; i++) {
	    	int s = sc.nextInt();
	    	int c = sc.nextInt();

    		if (!aaa(s,c)) {
    			System.out.println(-1);
    			return;
    		} 
    	}
    	if (check()) {

    	} else {
			System.out.println(-1);
			return;
    	}
    }
    private static boolean check() {
    	if (ans[0]==0 && n != 1) {
    		return false;
    	}
    	for (int i=0;i< ans.length; i++) {
    		if (ans[i]==-1){
    		System.out.print(0);

    		}else{
    		System.out.print(ans[i]);
    	}
    	}
		return true;
    }
    private static boolean aaa(int s, int c) {
    	if (s > n) {
    		return false;
    	}
    	if (ans[s-1]!=-1 && ans[s-1]!=c ) {
    		return false;
    	}
    	ans[s-1]=c;
    	return true;
    }
}



