import java.util.*;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int N = c.length;
		boolean ans = true;
		
		for (int i=0; i<N/2; i++) {
			if (c[i] != c[N-1-i]) {
				ans = false;
				break;
			}
		}
		
		for (int i=0; i<(N/2)/2 ;i++) {
			if (c[i] != c[N/2-1-i]) {
				ans = false;
				break;
			}
		}
		System.out.println(ans ? "Yes" : "No");
	}
}