import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat nfNum = NumberFormat.getNumberInstance();

		nfNum.setMinimumFractionDigits(1);
		nfNum.setMaximumFractionDigits(5);

		double r = scan.nextInt();
		double men = (double)r * r * 3.1459;
		double ensyu = (double)r * 2 * 3.1459;

		System.out.println(nfNum.format(men) + " " + nfNum.format(ensyu));
        scan.close();
    }

}