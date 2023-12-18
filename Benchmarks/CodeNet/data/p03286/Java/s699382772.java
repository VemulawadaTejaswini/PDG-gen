import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n==0) {
			System.out.println("0");
		}else {
			String ans = "";
			while(n!=1) {
				if(n>0) {
					ans = n%(-2) + ans;
					n /= -2;
				}else {
					ans = -n%2 + ans;
					n = -(n-1)/2;
	 			}
				
			}
			ans = "1" + ans;
			System.out.println(ans);
		}
		in.close();
	}

}
