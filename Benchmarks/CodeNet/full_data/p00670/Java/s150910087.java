import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0) break;
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			
			int cnt = 0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]+a[j]>s) cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}

}