
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		if(a==b) {
			System.out.println(1);
		}
		else if(b%a==0) {
			System.out.println(b/a+1);
		}else{
			if(a*(b/a+1)-b/a>=b) {
				System.out.println(b/a+1);
			}else {
				System.out.println(b/a+2);
			}
		}
	}

}
