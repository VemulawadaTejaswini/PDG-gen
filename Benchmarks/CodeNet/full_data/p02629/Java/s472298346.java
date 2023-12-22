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
			fact(n-1, false);
		}

	}

	public static void fact(long a, boolean f) {
		int count2 = 0;
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		if(a/26<=26) {
			//System.out.println(c[(int) (((a-1)/26)-1)]);
			System.out.print(c[(int) (a/26-1)]);
			if(f) {
				count2 = 0;
			}else {
				count2 = 1;
			}
			System.out.print(c[(int)(a%26+count2-1)]);
		}else {
			fact(a/26, true);	//二回目ループが存在するときは1を足さない
			if(f) {
				count2 = 0;
			}else {
				count2 = 1;
			}
			System.out.print(c[(int)(a%26+count2-1)]);
		}

	}

}
