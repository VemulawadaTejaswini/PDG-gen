import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N= sc.nextInt();
		long /*A[] = new long[N],*/ans=1;;
		for(int i=0;i<N;i++) {
			if(ans==Math.max(ans, (long)Math.pow(10, 18))) {
				ans=-1;
				break;
			}
			ans=ans*sc.nextLong();
		}
		if(ans==Math.max(ans, (long)Math.pow(10, 18)))
			ans=-1;
		System.out.println(ans);
	}
}