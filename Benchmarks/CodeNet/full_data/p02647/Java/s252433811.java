import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {  //Small array numbers...
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		boolean[] vis = new boolean[N]; //Keeps track of indices already = N
		int numN=0;
		int[] arr = new int[N];
		boolean easy = false;
		String fast = "";
		for (int i = 0; i < 1000; i++) {
			fast+=Integer.toString(N)+" ";
		}
		for (int i = 0; i < N; i++) {
			arr[i]=input.nextInt();
			if (arr[i]==N&&!vis[i]) {
				numN++;
				vis[i]=true;
			}
		}
		while (K>0) {
			int[] ans = new int[N];
			for (int i = 0; i < N; i++) {
				int curRange = arr[i];
				ans[i]++;
				for (int check = i-1; check >= Math.max(0, i-curRange); check--) {
					ans[check]++;
				}
				for (int check = i+1; check <= Math.min(N-1, i+curRange); check++) {
					ans[check]++;
				}
			}
			for (int i = 0; i < N; i++) {
				if (ans[i]==N&&!vis[i]) {
					numN++;
					vis[i]=true;
				}
			}
			if (numN==N) {
				easy=true;
				break;
			}
			K--;
			arr=ans;
		}
		if (easy) {
			for (int i = 0; i < N/1000; i++) {
				System.out.print(fast);
			}
			for (int i = 0; i < N%1000; i++) {
				System.out.print(N+" ");
			}
		}else {
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}