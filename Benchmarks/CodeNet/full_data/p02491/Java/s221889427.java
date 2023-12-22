import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	double f = (double)a/(double)b;
	int d = a/b;
	int r = a%b;
	System.out.println(d+" "+r+" "+f);	
	}
}