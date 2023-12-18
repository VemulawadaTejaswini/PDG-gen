import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i=0; i<n; i++){
			d[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] t = new int[m];
		for(int i=0; i<m; i++){
			t[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(d);
		Arrays.sort(t);
		
		int pos = 0;
		for(int i=0; i<n; i++){
			if(t[pos] == d[i]){
				pos++;
			}
			if(pos==m){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}