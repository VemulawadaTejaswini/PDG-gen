import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int tmp = 10,ans = 0;
		for (int i : ary) {
			ans+=i;
			while(ans%10 != 0) ans++;
			if(tmp > i%10 && i%10 !=0) tmp=i%10;
		}
		System.out.println(ans-(10-tmp));
	}
}
