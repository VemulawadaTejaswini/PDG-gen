import java.util.Scanner;
public class Main {
	static void swap(int[]p, int a) {
		int t = 0;
		
			t=p[a];
			p[a] = p[a+1];
			p[a+1] = t;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[]p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		
		int cnt = 0;
		
		for(int i = 0; i < n-1; i++) {			
			if(p[i]== i+1) {
				cnt++;
				swap(p,i);
				i++;
			}
			
		}
		
		System.out.println(cnt);
		
		
	}

}
