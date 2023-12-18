import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		if (n>m){
			result = m/2;
		}
		if (n<=m){
			if (m<2*n){
				result = m/2;
			}
			else if (m==2*n){
				result = n;
			}
			else{
				result = n+((m-(2*n))/4);
			}
		}
		System.out.println(result);
	}

}