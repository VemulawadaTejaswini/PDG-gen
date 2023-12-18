import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), ans = 0;
		if(b * 2 <= a){
			ans = a - (b * 2);
		}else {
			ans = 0;
		}
		System.out.println(ans);
	}
}