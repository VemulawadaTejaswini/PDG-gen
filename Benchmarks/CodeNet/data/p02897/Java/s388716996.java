import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int pattern=(n+1)/2;
		double p=((double) pattern)/((double) n);
		System.out.println(p);

	}

}
