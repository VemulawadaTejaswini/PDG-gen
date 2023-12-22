import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		Loop : while((n = scan.nextInt())!=0){

			int[] ary = new int[n];

			for (int i = 0; i < n; i++) {
				ary[i] = Integer.parseInt(scan.next());
			}

			Arrays.sort(ary);

			int cnt=0;
			for (int i = 0; i < n-1; i++) {
				if(ary[i]==ary[i+1]){
					cnt++;
					if(cnt==n/2){
						System.out.println(ary[i]);
						continue Loop;
					}
				}else cnt = 0;
			}
			System.out.println("NO COLOR");
		}
	}
}