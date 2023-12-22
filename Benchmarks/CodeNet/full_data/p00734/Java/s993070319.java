import java.util.ArrayList;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int[] a = new int[n];
			int m = in.nextInt();
			int[] b = new int[m];
			if(n==0 && m==0) break;
			int sumA = 0;
			int sumB = 0;
			for(int i=0; i<n; i++){
				a[i] = in.nextInt();
				sumA += a[i];
			}
			for(int i=0; i<m; i++){
				b[i] = in.nextInt();
				sumB += b[i];
			}
			String res = "-1";
			out: for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					if(sumA-a[i]+b[j] == sumB-b[j]+a[i]){
						res = a[i]+" "+b[j];
						break out;
					}
				}
			}
			System.out.println(res);
		}
	}
}