import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}
	
	void test(Scanner sc){
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N+1];
		a[1] = sc.nextInt();
		int here=-1;
		for (int i = 2; i <= N; i++) {
			a[i] = sc.nextInt();
			if(a[i-1]<= 0 && a[i] > 0){
				here = i;
			}
		}
		int out=0;
		if(here==-1){
			// all in one side
			if(a[1]>=0){
				out += a[K]; 
			}else{
				out += (-1 * a[N+1-K]);
			}
		}else{
			out  = Integer.MAX_VALUE;
			here--;
			int left = here>K?here-1-K:1;
			int right = left + K -1;
			here++;
			while(left<=here && right <= N){
				int dist = a[right]-a[left];
				int addme=0;
				if(a[left]<0){
					addme = (-1 * a[left]);
				}else{
					addme =a[left];
				}
				
				addme = addme>a[N]?a[N]:addme;
				
				dist+=addme;
				if(out>dist){
					out=dist;
				}
				left++;
				right++;
			}
		}
		System.out.println(out);
	}
}
