import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0; i < 3; i++) num[i] = sc.nextInt();
		Arrays.sort(num);
		int ans = num[2] - num[1];
		num[1] += ans; num[0] += ans;
		if((num[2] - num[0]) % 2 == 0) ans += (num[2] - num[0]) / 2;
		else ans += (num[2] + 1 - num[0]) / 2 + 1;
		System.out.println(ans);
	}
}
