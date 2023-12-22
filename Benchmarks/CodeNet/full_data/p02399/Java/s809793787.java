import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d,r;
		double f;
		d = b/c;
		r = b - (c * d);
		f = (double)b/(double)c;
		//BigDecimal x = new BigDecimal(f);
		//x = x.setScale(13, BigDecimal.ROUND_HALF_UP);
		//System.out.print(d+" "+r+" "+x);
		System.out.print(d+" "+r+" ");
		System.out.printf("%.8f\n",f);
	}

}