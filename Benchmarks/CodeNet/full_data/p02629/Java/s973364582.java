import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		if(n<=26) {
			System.out.println(c[(int) (n-1)]);
		}else {
			fact(n);
		}

	}

	public static void fact(long a) {
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		if((a-1)/26<=26) {
			System.out.print(c[(int) (((a-1)/26)-1)]);
			System.out.print(c[(int) (((a-1)&26)-1)]);
		}else {
			fact((a-1)/26);
			System.out.print(c[(int) (((a-1)&26))]);
		}

	}

}
