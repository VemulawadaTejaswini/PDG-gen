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
			}else{
				long a1 = (long) (Math.ceil((double)a/(double)f.a)*f.a);
				long t1 = (a1/f.a)*f.t;
				long t2 = (long) (Math.ceil((double)t/(double)f.t)*f.t);
				long a2 = (t2/f.t)*f.a;
				if(a1>=a && t1>=t){
					t = t1;
					a = a1;
					if(a2>=a && t2>=t && a1+t1 > a2+t2){
						t = t2;
						a = a2;
					}
				}else{
					t = t2;
					a = a2;
				}			
			}
			//System.out.println(t+":"+a);
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