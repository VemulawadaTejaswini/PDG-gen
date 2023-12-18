import java.util.Scanner;

//ABC111-B

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = Integer.parseInt(sc.next());
		int ans = 0;

		if(x <= 111){
			ans = 111;
		}else if(x <= 222){
			ans = 222;
		}else if(x <= 333){
			ans = 333;
		}else if(x <= 444){
			ans = 444;
		}else if(x <= 555){
			ans = 555;
		}else if(x <= 666){
			ans = 666;
		}
		else if(x <= 777){
			ans = 777;
		}
		else if(x <= 888){
			ans = 888;
		}
		else if(x <= 999){
			ans = 999;
		}


			System.out.println(ans);
	}
}
