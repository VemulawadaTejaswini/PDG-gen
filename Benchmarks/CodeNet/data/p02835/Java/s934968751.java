import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		String moji = (sum(A) >= 22) ? "bust" : "win";
		System.out.println(moji);
	}

	public static int sum(int[] num){
		int sum = 0;
		for(int i = 0; i < num.length;i++){
			sum += num[i];
		}
		return sum;
	}
}
