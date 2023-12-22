import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				i++;
				if(i==n) break;
				a[i] = sc.nextInt();
				if(a[i-1]!=a[i]){
					for(int j=i-1;j>=0;j--){
						if(a[j]==a[i]) break;
						a[j] = a[i];
					}
				}
			}
			int count = 0;
			for(int i=0;i<n;i++){
				if(a[i]==0) count++;
			}
			System.out.println(count);
		}
	}
}