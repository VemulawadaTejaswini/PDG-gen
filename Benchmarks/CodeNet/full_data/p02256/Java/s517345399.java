import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long x=scan.nextInt();
		long y=scan.nextInt();
		long GCD=0;
		while(x%y!=0){
			if(x>=y){
				x=x%y;
				GCD=x;
			}
			else{
				y=y%x;
				GCD=y;
			}
		}
		System.out.println(GCD);
	}
}