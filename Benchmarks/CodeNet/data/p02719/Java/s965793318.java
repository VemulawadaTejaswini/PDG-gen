import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long n=scanner.nextInt();
		long k=scanner.nextInt();
		long a=n%k;
		long b=k-a;
		if(a>b)a=b;
		System.out.println(a);
	}

}