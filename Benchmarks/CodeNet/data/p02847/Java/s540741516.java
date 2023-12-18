import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		double x = scan.nextDouble();
		double max = x/a;
		int c = (int)max;
				
		for(int i=c;i>=0;i--) {
			String num = String.valueOf(i);
			if(a*i + b*num.length() <= x) {
				if(i >= 1000000000) {
					System.out.println(1000000000);
					break;
				}else {
					System.out.println(i);
					break;
				}
			}
			if(i == 0) {
				System.out.println(i);
			}
		}
	}

}