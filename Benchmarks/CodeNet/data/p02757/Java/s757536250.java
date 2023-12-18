
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		char[] cAry = sc.next().toCharArray();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = cAry[i] - 48;
		}
		int[] aryCopy = ary.clone();
		long count = 0;
		for(int i = 0; i < n; i++){
			ary = aryCopy.clone();
			if(ary[i] % p == 0){
				count++;
			}
			for(int i2 = i + 1; i2 < n; i2++){
				ary[i2] = (10 * ary[i2 - 1] + ary[i2]) % p;
				if(ary[i2] == 0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
