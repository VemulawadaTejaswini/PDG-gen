import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		int[] list = new int[501];
		for(int i=0; i<501; i++){
			list[i] = 0;
		}
		int n = Integer.parseInt(bf.next());
		for(int i=0; i<n; i++){
			list[Integer.parseInt(bf.next())]++;
		}
		int q = Integer.parseInt(bf.next());
		int ans = 0;
		for(int i=0; i<q; i++){
			ans += list[Integer.parseInt(bf.next())];
		}
		System.out.println(ans);
	}
}