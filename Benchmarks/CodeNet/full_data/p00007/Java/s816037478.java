import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		@SuppressWarnings({"resource" })
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int debt = 100000;
		for(int j=0;j<i;j++){
			debt = f_debt(debt);
		}
		System.out.println(debt);
	}

	private static int f_debt(int n){
		n = (int)(n * 1.05);
		if(n % 1000 != 0){
			n = n - (n%1000) + 1000;
		}
		return n;
	}
}