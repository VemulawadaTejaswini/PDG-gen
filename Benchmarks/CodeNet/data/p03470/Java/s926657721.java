import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int[] mochiBucket = new int[101];
		
		int n = sc.nextInt();
		int dan = 0;
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			mochiBucket[num]++;
			if(mochiBucket[num] == 1) {
				dan++;
			}
		}
		
		
		System.out.println(dan);
	}
}
