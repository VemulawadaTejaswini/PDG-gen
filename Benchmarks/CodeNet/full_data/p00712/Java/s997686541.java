import java.util.Scanner;

public class Main{
	static int numerator;
	static int denominator;
	static int maxproduct;
	static int parts;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			numerator = sc.nextInt();
			denominator = sc.nextInt();
			maxproduct = sc.nextInt();
			parts = sc.nextInt();
			if(parts==0) break;
			int count = 0;
			count += Judge(numerator, denominator, parts, 1, 0);
			System.out.println(count);
		}
	}

	static int Judge(int p, int q, int separate, int now_pro, int prev_deno){
		int count = 0;
		if(p==0){
			count++;
		}
		if(separate<=0) return count;

		int deno = maxproduct/now_pro + 1;
		while(separate*q<p*deno) deno--;
		while(p*deno >= q && prev_deno<=deno){
			int subtraction_deno = q * deno;
			int subtraction_nume = p * deno - q;
			if(now_pro*deno<=maxproduct){
				count += Judge(subtraction_nume, subtraction_deno, separate-1, now_pro*deno, deno);
			}
			deno--;
		}
		return count;
	}
}