import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0) break;
			int[] a = new int[101];
			for(int i=0;i<n;i++) a[sc.nextInt()]++;
			
			int cnt = 0;
			for(int i=1;i<=100;i++){
				for(int j=i;j<=100;j++){
					if(s<i+j){
						if(i==j) cnt += a[i]*(a[i]-1)/2;
						else cnt += a[i]*a[j];
					}
				}
			}
			
			System.out.println(cnt);
		}
	}

}