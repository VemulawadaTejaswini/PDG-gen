import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int h[] =  new int[n];
		
		for(int i=0;i < n ; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
	
		int max = 0;
		int cnt = 0;
		for(int i = 0 ;i < n -1 ; i++) {
			if(h[i] >= h[i+1] ) {
				cnt++;
			}else {
				if (cnt > max) {
					max = cnt;
				}
				cnt = 0;
			}
			if (cnt > max) {
				max = cnt;
			}
		}
		
		System.out.println(max);
	}
}
