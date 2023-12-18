import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,num;
		boolean ab,bb;
		String str;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		a = num/100;
		b = num - a*100;
		if(a>0&&a<13) {
			ab = true;
		}else {
			ab = false;
		}
		if(b>0&&b<13) {
			bb = true;
		}else {
			bb = false;
		}
		if(ab&&bb) {
			str = "AMBIGUOUS";
		}else if(ab==true) {
			str = "MMYY";
		}else if(bb==true) {
			str = "YYMM";
		}else {
			str = "NA";
		}

		System.out.println(str);
	}
}
