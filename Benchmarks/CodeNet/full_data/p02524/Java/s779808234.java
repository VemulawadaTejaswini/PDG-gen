//Op`ÌQÓÆ»ÌÔÌp©çAÊÏAüÌ·³,
//a ðêÓÆµ½Æ«Ì³ðßévO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double s = a * b * Math.sin(c * Math.PI / 180 ) / 2;
		double l = a + b + Math.sqrt(b*b + a*a - 2* a * b* Math.cos(c * Math.PI / 180));
		double h = b * Math.sin(c * Math.PI / 180);
		System.out.printf("%1.8f\n",s);
		System.out.printf("%1.8f\n",l);
		System.out.printf("%1.8f\n",h);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}