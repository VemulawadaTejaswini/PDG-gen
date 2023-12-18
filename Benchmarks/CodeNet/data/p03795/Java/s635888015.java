import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		int p=1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x=0L;
		do {
		x =x+n*p;
		n=n-1;
		if(n==0) {
			break;
		}
		}while(true);
		long y = x%(100000000+7);
		System.out.println(y);
		scan.close();
	}
}