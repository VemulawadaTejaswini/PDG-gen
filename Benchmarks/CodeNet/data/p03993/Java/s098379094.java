import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		int count =0;
		int[][] sys_m = new int[n][n];
		// create second array 
		for (int i=0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		//count
		for (int i=0;i<n;i++){
			int self = i;
			int self_love = ar[i]-1;
			int love_one = self_love;
			int love_ones_love = ar[self_love]-1;
			if (self == love_ones_love && self_love == love_one){
				count ++;
			}
		}
		//System.out.print("pairs" + count/2);
		System.out.print(count/2);
	}

}