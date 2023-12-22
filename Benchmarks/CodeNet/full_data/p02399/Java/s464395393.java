import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat nfNum = NumberFormat.getNumberInstance();

		nfNum.setMinimumFractionDigits(1);
		nfNum.setMaximumFractionDigits(5);

		long d, r;//d = ??????r = ?????????
		double f;//f = ???????°???°
		long a = scan.nextInt();//a = ??????????????°
		int b = scan.nextInt();//b = ????????°

		d = a / b;
		r = a % b;
		f = (double)a / b;

		System.out.println(d + " " + r + " " + nfNum.format(f));
        scan.close();
    }

}