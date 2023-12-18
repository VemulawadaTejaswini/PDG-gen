import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();

		char[] s = sc.next().toCharArray();
		char[] qt = new char[q];
		boolean[] ql = new boolean[q];

		for(int i = 0 ; i < q; i++) {
			qt[i] = sc.next().charAt(0);
			ql[i] = sc.next().charAt(0) == 'L'; 
		}
		int l = remLeft(s,qt,ql);
		int r = remRight(s,qt,ql);
		System.out.println(Math.max(0,r-l));
	}
	
	
	int remLeft(char[] s, char[]qt, boolean[] ql) {
		int l = 0;
		int r = s.length;
		for(;l!=r;) {
			int mid  = (l+r)/2;
			if(remL(s,qt,ql,mid)) {
				l = mid+1;
			}else {
				r = mid;
			}
		}
		return l;
	}

	int remRight(char[] s, char[]qt, boolean[] ql) {
		int l = 0;
		int r = s.length;
		for(;l!=r;) {
			int mid  = (l+r)/2;
			if(!remR(s,qt,ql,mid)) {
				l = mid+1;
			}else {
				r = mid;
			}
		}
		return l;
	}
	
	boolean remR(char[] s, char[] qt, boolean[] ql,int pos) {
		for(int i = 0; i < qt.length; i++) {
			if(pos == s.length) {
				return true;
			}
			if(s[pos] == qt[i]) {
				if(ql[i]) {
					pos--;
					pos = Math.max(0, pos);
				}else {
					pos++;
				}
			}
			
		}
		
		return pos == s.length;
				
	}

	boolean remL(char[] s, char[] qt, boolean[] ql,int pos) {
		for(int i = 0; i < qt.length; i++) {
			if(pos == -1) {
				return true;
			}
			if(s[pos] == qt[i]) {
				if(ql[i]) {
					pos--;
				}else {
					pos++;
					pos = Math.min(pos, s.length-1);
				}
			}
			
		}
		
		return pos == -1;
				
	}

}