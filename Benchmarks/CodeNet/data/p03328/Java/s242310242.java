import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int tmp = 0;
		int i =0;
		while(tmp <= a){
			tmp += ++i;
		}
		int ans = 1;
		i++;
		while((tmp + i - ans) != b){
			ans++;
			}
		
		System.out.println(ans);
	}

}
