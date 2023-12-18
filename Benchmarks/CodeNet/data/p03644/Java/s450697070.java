import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 64;
		while(num < ans) {
			ans /= 2;
		}
		System.out.println(ans);
	}
}