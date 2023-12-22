import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt()+1;
		int c=scan.nextInt();
		int sum=0;
		for(int i=0;i<c;i++) {
			sum+=scan.nextInt();
		}
		if(sum%n>0) {
			System.out.println(sum/n+1);
		}
		else {
			System.out.println(sum/n);
		}
	}
}

