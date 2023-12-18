import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long count=0;
		if(n%2==0) {
			for(int i=10;i<=n;i+=10) {//15,25などは計算する必要がない
				count += f5(i);
			}
			System.out.println(count);
		}else {
			System.out.println(0);
		}
	}

	public static long f5(long n) {
		if(n%5!=0) {
			return 0;
		}else{
			return 1+f5(n/5);
		}
	}
}


