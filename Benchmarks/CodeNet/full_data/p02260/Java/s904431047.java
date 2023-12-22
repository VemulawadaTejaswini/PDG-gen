import java.util.Scanner;
public class SelectionSort {
	private static int N_MAX = 99999;
	
	static int[] a = new int[N_MAX];

public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++){
			a[i]= scan.nextInt();
			
		}
		for(int i = 0; i< n; i++){
			int mini = i;
			for (int j = i; j < n; j++){
				if(a[j] < a[mini]){
					mini = j;
				} else {}
				
			}
			if (i != mini){
				ans++;
				int hold = a[i];
				a[i] = a[mini];
				a[mini] = hold;
			}
		}
		
		for (int k = 0; k < n - 1; k++){
			System.out.println(a[k]);
		}
		System.out.println(a[n-1]);
		System.out.println(ans);
	
}
}

