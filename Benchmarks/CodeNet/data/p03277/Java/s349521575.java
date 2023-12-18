
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		
		int a[] = new int[n];
		int a2[] = new int[n];
		a3 = new int[n];
		s = new int[n+1];
		for(int i = 0; i < n; i ++){
			a[i] = sc.nextInt();
			a2[i] = a[i];
		}
		
		int left = 0;
		int right = n;
		
		Arrays.sort(a2);
		
		if(n == 1){
			System.out.println(a[0]);
			return;
		}
		for(;;){
			int mid = (left + right+1) /2;
			
			int r = check(a, a2[mid]);
			
			if(r==0){
				System.out.println(a2[mid]);
				return;
			}
			if(r == -1){
				right = mid-1;
			}else{
				left = mid+1;
			}
			
		}
		
		
	}
	
	int[] a3 ;
	int[] s;
	int check(int[] a , int piv){
//		System.out.println("check "+ piv);
		int p_1 = countLess(a, piv-1);
//		System.out.println("count "+(piv-1)+": "+p_1);
		int p_2 = countLess(a, piv);
//		System.out.println("count "+(piv)+": "+p_2);
		
		int m = (a.length)*(a.length+1) / 4;
//		System.out.println("   "+m);
		if(p_1 <= m && m < p_2){
			return 0;
		}
		if( p_1 > m){
			return -1;
		}else{
			return 1;
		}
	}
	
	int countLess(int[] a, int piv){
		Arrays.fill(a3, 0);
		Arrays.fill(s, 0);
		for(int i = 0 ; i < a.length; i++){
			a3[i] = a[i] > piv?1:0;
			s[i+1] = s[i]+a3[i];
		}
//		System.out.println(Arrays.toString(s));
		int res = 0;
		for(int i =0 ; i< a.length; i++){
			for(int j = 1 ; i+j <= a.length; j++){
				int x = s[i+j] - s[i];
				if(x <= (j-1)/2 ){
					
//					System.out.println(i + " "+j);
					res ++;
				}
			}
		}
		return res;
	}
}
