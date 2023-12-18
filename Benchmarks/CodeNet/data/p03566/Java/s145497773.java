import java.util.Scanner;

/**
 * https://abc076.contest.atcoder.jp/tasks/abc076_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] t = new double[N];
		double[] v = new double[N];
		for(int i=0; i<N; i++) t[i] = sc.nextDouble();
		for(int i=0; i<N; i++) v[i] = sc.nextDouble();
		sc.close();
		
		double[] gv = new double[N];
		gv[N-1] = 0;
		for(int i=N-2; i>=0; i--){
			gv[i] = Math.min(gv[i+1]+t[i+1],v[i+1]);
		}
		
		double ans = 0;
		double current = 0;
		for(int i=0; i<N; i++){
			//System.out.println("=============");
			double next = gv[i];
			if(current<=next){
				double ut = Math.min(t[i],v[i]-current);
				double maxV = current+ut;
				double mt = Math.max(0, t[i]-ut);
				ans += (current*ut)+((maxV-current)*ut/2.0);
				ans += maxV*mt;
				current = maxV;
			}else{
				double maxT = (t[i]-current)/2.0;
				//System.out.println(maxT);
				double ut = Math.max(0, Math.min(maxT, v[i]-current));
				double maxV = current+ut;
				double et = Math.min(t[i]-maxT, maxV-next);
				double mt = Math.max(0, t[i]-ut-et);
				ans += (current*ut)+((maxV-current)*ut/2.0);
				ans += maxV*mt;
				ans += (next*et)+((maxV-next)*et/2.0);
				current = next;
			}
		}
		System.out.println(ans);
	}

}
