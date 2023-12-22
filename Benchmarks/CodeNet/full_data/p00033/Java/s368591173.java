import java.util.*;
public class Main { 
	public static int[] list;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			list = new int[10];
			for(int j = 0; j < 10; j++) {
				list[j] = stdIn.nextInt();
			}
			if(solv(0,0,0)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean solv(int lastL, int lastR, int c) {
		if(c == 10) return true;
		int a = list[c];
		if(lastL < a && solv(a,lastR,c+1)) {
			return true;
		}
		if(lastR < a && solv(lastL,a,c+1)) {
			return true;
		}
		return false;
	}
}