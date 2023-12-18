import java.util.Scanner;
public class Main {
	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		int K=scan.nextInt();
		int A=scan.nextInt();
		int B=scan.nextInt();
		int num=0;
	for(int i=0;i<=B;i=+K) {
		if(i>=A&&i<=B) {
			num=1;
		}
	}
	if(num==0) {
		System.out.println("NG");
	}
	else {
		System.out.println("OK");
	}
	}
}
