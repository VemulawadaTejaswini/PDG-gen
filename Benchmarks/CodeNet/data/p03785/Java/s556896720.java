import java.util.*;
public class Main{
	public static int[] a;
	public static int n,c,k;
	public static int count = 0;
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		c = scan.nextInt();
		k = scan.nextInt();
		a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scan.nextInt();
		}
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1-i; j++){
				if(a[j]>a[j+1]){
					int ij = a[j];
					a[j] = a[j+1];
					a[j+1] = ij;
				}
			}
		}
		cal(0);
		System.out.println(count);
	}
	public static void cal(int i){
		while(i!=n){
		for(int x=1; x<=c; x++){
			if(i+c-x>n-1){continue;}
			if(a[i+c-x]-a[i]<=k){
				count++;
				i = i+c-x+1;
				break;
			}
		}
	}
		
	}
}