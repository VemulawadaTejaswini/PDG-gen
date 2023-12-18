import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		if(n==1) {
			System.out.println(1);
			System.exit(0);
		}
		Arrays.sort(a);
		int max = 0;
		for(int i=0; i<n; i++) {
			int count = 0;
			int tmp = a[i];
			while(a[i]==tmp){
				i++;
				count++;
				if(i==n) break;
			}
			int k = i;
			while(a[k]-tmp<=2) {
				count++;
				k++;
				if(k==n) break;
			}
			max = max>count?max:count;
		}
		System.out.println(max);
	}

}