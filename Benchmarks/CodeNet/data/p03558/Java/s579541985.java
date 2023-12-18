
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int res = 0;

	public static void main(String[] args) throws Exception {

		int n = sc.nextInt();


		System.out.println(helper(n));

	}

	private static int helper(int n) {
		// TODO Auto-generated method stub
		int k=sum(n);
		for(int i=2;i<1000000;i++){
			k=Math.min(k, sum(n*i));
		}
		return k;
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		int res=0;
		while(n!=0){
			res+=n%10;
			n=n/10;
		}
		return res;
	}

}