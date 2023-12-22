import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n, v, j;
		
		n = scan.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			
			a[i] = scan.nextInt();
			
		}
		
		for(int k = 0; k < n; k++){
			
			if(k == n - 1){
				
				System.out.print(a[k]);
				System.out.println();
				
			}else{
				
				System.out.print(a[k]+" ");
				
			}
		}
		
		
		for(int i = 1; i <= n - 1; i++){
			
			v = a[i];
			j = i - 1;
			
			while(j >= 0 && a[j] > v){
				
				a[j + 1] = a[j];
				j--;
				a[j + 1] = v;
				
			}
			
			for(int k = 0; k < n; k++){
				
				if(k == n - 1){
					
					System.out.print(a[k]);
					System.out.println();
					
				}else{
					
					System.out.print(a[k]+" ");
					
				}
			}
		}
	}
}