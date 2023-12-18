import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] money = new int[]{0,1,6,9,36,216,1296,7776,46656,81,729,6561,59049};
		Arrays.sort(money);
		int count = 0;
		for( int i=12; i>=1; i-- ){
			count += N/money[i];        
			N = N%money[i];
		}
		System.out.println(count);
	}
}
