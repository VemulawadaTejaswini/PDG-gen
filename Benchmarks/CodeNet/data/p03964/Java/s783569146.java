import java.util.Scanner;

/**
 * https://abc046.contest.atcoder.jp/tasks/arc062_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Fraction[] fractions = new Fraction[N];
		for(int i=0; i<N; i++){
			fractions[i] = new Fraction(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		
		long t = fractions[0].t;
		long a = fractions[0].a;
		for(int i=1; i<N; i++){
			Fraction f = fractions[i];
			if(f.t==f.a){
				a = t = Math.max(t, a);
			}else if(f.t<f.a){
				a = (long) (Math.ceil((double)a/(double)f.a)*f.a);
				while(t>(a/f.a)*f.t){
					a+=f.a;
				}
				t = (a/f.a)*f.t;
			}else{
				t = (long) (Math.ceil((double)t/(double)f.t)*f.t);
				while(a>(t/f.t)*f.a){
					t+=f.t;
				}
				a = (t/f.t)*f.a;
			}
		}
		System.out.println(t+a);

	}
	
	static class Fraction{
		int t;
		int a;		
		Fraction(int t, int a){
			this.t = t;
			this.a = a;
		}
	}

}