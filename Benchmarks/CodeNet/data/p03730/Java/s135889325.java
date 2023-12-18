import java.util.*;
public class Main{
	static String ChooseI(int p, int q, int r){
		int gcd = 1;
		int ph = Math.max(p, q);
		int qh = Math.min(p, q);
		for( ; ; ){
			gcd = ph % qh;
			if(gcd==0){
				gcd = qh;
				break;
			}
			if(qh%gcd==0)break;
			ph = qh;
			qh = gcd;
		}
		if(r%gcd==0)return "YES";
		else return"NO";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(ChooseI(a, b, c));
	}
}