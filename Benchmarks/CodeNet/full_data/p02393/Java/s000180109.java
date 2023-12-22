import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		int n1,n2,n3;
		if(a<=b && a<=c) {
			n1=a;
			n2=(b<=c)?b:c;
			n3=(b>=c)?b:c;
			}
		else if (b<=c) {
			n1=b;
			n2=(a<=c)?a:c;
			n3=(a>=c)?a:c;
		}
		else{
			n1=c;
			n2=(a<=b)?a:b;
			n3=(a>=b)?a:b;
		}
		
		System.out.print(n1+" "+n2+" "+n3);

	}

}