import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n-1];
		
		int sum = 0;
		
		for(int i = 0; i < n-1; i++){
			b[i] = sc.nextInt();
		}
		a[0] = b[0];
		a[n-1] = b[n-2];
		
		for(int i = 0; i < n-2; i++){
			a[i+1] = min(b[i],b[i+1]);
			}
		for(int i = 0; i < n; i++){
			sum += a[i];
		}
		System.out.println(sum);
		}
		
		public static int min(int a, int b){
			if(a < b)
				return a;
			else
				return b;
		}
	
	}