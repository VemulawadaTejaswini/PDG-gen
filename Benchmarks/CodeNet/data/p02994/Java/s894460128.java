import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int sum = n*l + n*(n+1)/2 - n;
		if(l>0) sum -= l;
		else if(l+n-1<0) sum -= l+n-1;
		System.out.println(sum);
		in.close();

	}

}
