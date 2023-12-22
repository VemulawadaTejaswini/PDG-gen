import java.math.BigDecimal;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//半径rの円の面積と外周を求める
		Scanner sc=new Scanner(System.in);
		double r=Double.parseDouble(sc.next());//半径
		double pi=Math.PI;//円周率
		double m=r*r*pi;
		String val_m=String.valueOf(m);
		BigDecimal bd_m=new BigDecimal(val_m);
		BigDecimal menseki=bd_m.setScale(6,BigDecimal.ROUND_DOWN);
		double g=2*r*pi;
		String val_g=String.valueOf(g);
		BigDecimal bd_g=new BigDecimal(val_g);
		BigDecimal gaisyu=bd_g.setScale(6,BigDecimal.ROUND_DOWN);
		System.out.println(menseki+" "+gaisyu);
	}

}

