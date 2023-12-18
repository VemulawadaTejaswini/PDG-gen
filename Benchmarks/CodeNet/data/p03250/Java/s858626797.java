import java.util.Arrays;
import java.util.Scanner;

public class ABC110A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0;i < 3;++i)
			num[i] = sc.nextInt();
		sc.close();
		
		Arrays.sort(num);
		int ans = num[0] + num[1] + num[2]*10;
		System.out.println(ans);
	}
}
