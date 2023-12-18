import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long total = 0;
		long[] a = new long[3*n];
		for(int i=0; i<3*n; i++){
			a[i] = scan.nextInt();
		}
		for(int i=3*n-1; 0<i; i--){
			for(int j=0; j<i; j++){
				if(a[j]<a[j+1]){
					long k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
				}
			}
		}
		for(int i=1; i<2*n; i=i+2){
			total = total + a[i];
		}
		System.out.println(total);
	}
}