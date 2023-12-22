import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0 && k==0) break;
			int[] a = new int[n];
			int sum = 0,maxsum = 0;
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			for(int i=0;i<n-k;i++){
				sum = 0;
				for(int j=0;j<k;j++){
					sum += a[i+j];
				}
				if(sum > maxsum) maxsum = sum;
			}
			System.out.println(maxsum);
		}
	}
}