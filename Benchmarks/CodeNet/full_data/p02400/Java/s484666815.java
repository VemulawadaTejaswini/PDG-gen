import java.util.*;

public class Main{
	public static void main(String[] args){
		int r;
		double ce,cf;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		ce = (r*r)*3.14;
		//円の面積
		cf = (2*r)*3.14;
		//円周
		System.out.println(ce+" "+cf);
	}
}