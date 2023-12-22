import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			//Initialization
			double[] a = {sc.nextDouble(), sc.nextDouble()};
			double[] b = {sc.nextDouble(), sc.nextDouble()};
			double[] c = {sc.nextDouble(), sc.nextDouble()};
			double[] p = {sc.nextDouble(), sc.nextDouble()};

			TwoVector vab, vac, vap, vca, vcb, vcp;
			vab = new TwoVector(b, a);
			vac = new TwoVector(c, a);
			vap = new TwoVector(p, a);
			vca = new TwoVector(a, c);
			vcb = new TwoVector(b, c);
			vcp = new TwoVector(p, c);

			if(TwoVector.getSgnSq(vab, vap) * TwoVector.getSgnSq(vap, vac) > 0 && TwoVector.getSgnSq(vca, vcp) * TwoVector.getSgnSq(vcp, vcb) > 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
	class TwoVector{
		public double x, y;
		
		public TwoVector(double[] c){
			x = c[0];
			y = c[1];
		}
		public TwoVector(double[] c, double[] s){
			x = c[0] - s[0];
			y = c[1] - s[1];
		}

		public static double getSgnSq(TwoVector a, TwoVector b){
			return (a.x * b.y - a.y * b.x) / 2;
		}
	}