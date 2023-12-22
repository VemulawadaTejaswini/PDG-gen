import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0) break;
			int[] a = new int[101];
			int[] b = new int[102];
			for(int i=0;i<n;i++) a[sc.nextInt()]++;
			for(int j=100;j>0;j--) b[j] = b[j+1] + a[j];
			
			int cnt = 0;
			for(int i=0;i<s/2;i++) cnt += b[s-i] * a[i+1];
			
			System.out.println(cnt);
		}
	}

}