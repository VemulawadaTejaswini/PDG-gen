import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);

	     int n = sc.nextInt();
	     int x = sc.nextInt();


	     int CrntD;
	     int d = 0;

	     for (int i = 0; i < n; i++) {
	    	 int xi = sc.nextInt();
	    	 CrntD = Math.abs(x - xi);
	    	 if (i == 0) {
				d = CrntD;
			} else {
				if (d > CrntD) {
					d = CrntD;
				}
			}
		}

	     System.out.println(d);
	}
}