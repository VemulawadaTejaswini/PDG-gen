import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger sum = new BigInteger("0");
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String [] a = str.split("[D]");
			for(int i=0;i<a.length;i++) {
				if(a[i].length()>0) {
					sum = sum.add(new BigInteger(a[i]));
				}
			}
		}
		System.out.println(sum.toString());
	}
}
