import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int[] ans = new int[10];
		int len = ans.length;
		for(int i = 0; i < len; i++) {
			ans[i] = sc.nextInt();
		}
		Arrays.sort(ans);
		len--;
		for(int i = len; i > len - 3; i--) {
			System.out.println(ans[i]);
		}
	}
}