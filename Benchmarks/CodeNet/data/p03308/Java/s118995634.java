import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int max=0;
		int min=2147483647;
		int a=0;
		for(int i=0;i<n;i++) {
			a=scan.nextInt();
			if(max<=a) {
				max=a;
			}
			if(min>=a){
				min=a;
			}
		}
		int result=max-min;

		System.out.println(result);
		scan.close();		

	}
}