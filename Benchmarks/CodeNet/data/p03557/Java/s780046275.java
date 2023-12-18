import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//********宣言************//
		int n = sc.nextInt();
		long[] up = new long[n];
		long[] mid = new long[n];
		long[] end = new long[n];
		//++++++++++代入++++++++++++//
		for(int i = 0; i < n; i++) {
			up[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			mid[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			end[i] = sc.nextLong();
		}
		//++++++++++++++++ソート+++++++++//
		Arrays.sort(up);
		Arrays.sort(mid);
		Arrays.sort(end);
		long count = 0;
		//************そるぶ************//
		first: for(int i = n - 1; i >= 0; i--) {
			long selUp = up[i];
			//System.out.println("UP"+selUp);
			second: for(int m = n - 1; m >= 0; m--) {
				long selMid = mid[m];
				//System.out.println("MID"+selMid);
				if(selUp >= selMid) {
					break second;
					//continue;
				}
				therd: for(int j = n - 1; j >= 0; j--) {
					long selEnd = end[j];
					//System.out.println("END"+selEnd);
					if(selMid >= selEnd) {
						break therd;
						//continue;
					} else {
						count++;
						System.out.println("最終判定"+selUp+" "+selMid+" "+selEnd);
					}
				}
			}
		}
		System.out.println(count);
	}
}