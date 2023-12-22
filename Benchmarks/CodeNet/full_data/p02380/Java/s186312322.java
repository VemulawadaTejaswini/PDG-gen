import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=Double.parseDouble(sc.next());
		double b=Double.parseDouble(sc.next());
		double rc=Double.parseDouble(sc.next());
		double S=(a*b*Math.sin(Math.toRadians(rc))/2);
		double L=a+b+(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(rc))));
		double h=S*2/a;
		String strAns=String.valueOf(S);
		BigDecimal bd=new BigDecimal(strAns);
		BigDecimal A=bd.setScale(8, BigDecimal.ROUND_HALF_UP);
		strAns=String.valueOf(L);
		bd=new BigDecimal(strAns);
		BigDecimal B=bd.setScale(8, BigDecimal.ROUND_HALF_UP);
		strAns=String.valueOf(h);
		bd=new BigDecimal(strAns);
		BigDecimal C=bd.setScale(8, BigDecimal.ROUND_HALF_UP);
		System.out.println(A+" "+B+" "+C);
	}

}

