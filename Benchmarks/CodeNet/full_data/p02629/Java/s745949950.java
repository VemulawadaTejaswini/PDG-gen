import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());


		String ans = "";
		while(n != 0) {
			char tmp;
			if(n%26 == 0) {
				 tmp = 'z';
			}else {
				 tmp = (char) (n%26 +96);
			}
			
			if(n <= 26) {
				n = 0l;
			}
			n /= 26;
			ans = tmp + ans;
			
		}
		System.out.println(ans);
	}
}


