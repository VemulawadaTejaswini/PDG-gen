import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n=scanner.nextInt();
		int a=scanner.nextInt();
		int b=scanner.nextInt();

		int result=0;

		for(int i=1;i<=n;i++) {
			int buf=getsumofkakuketa(i);

			if(isMacthed(a, b, buf)) {
				result+=buf;
			}
		}

		System.out.println(result);



		scanner.close();

	}

	public static int getsumofkakuketa(int n) {

		int result=0;

		while(true) {
			if(n/10!=0) {
				result+=n%10;
				n/=10;
			}else {
				return result;
			}
		}



	}

	public static boolean isMacthed(int a,int b,int sum) {

		if(sum>=a && sum<=b) {
			return true;
		}else {
			return false;
		}

	}



	}




}
