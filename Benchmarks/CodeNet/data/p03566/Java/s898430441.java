import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		solve();
	}

	public static void solve() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] t = new double[N+2];
		double[] v = new double[N+2];
		t[0] = 0; v[0] = 0;
		t[N+1] = 0; v[N+1] = 0;
		for (int i=1; i <= N; i++) { t[i] = scan.nextDouble(); }
		for (int i=1; i <= N; i++) { v[i] = scan.nextDouble(); }

		double S = 0;
		for(int i=1; i <= N; i++) {
			double accel_time = 0;
			double decel_time = 0;
			double flat_time = 0;
			accel_time = v[i] > v[i-1] ? v[i]-v[i-1] : 0;
			decel_time = v[i+1]-v[i] > 0 ? 0 : Math.abs(v[i+1]-v[i]);
			flat_time = t[i]-(accel_time+decel_time);
			if(flat_time<0) {
				double ext = (accel_time+decel_time)-t[i];
				accel_time -= ext/2;
				decel_time -= ext/2;
				flat_time = 0;
			}
			double S1 = (v[i-1]+accel_time/2)*accel_time;
			double S2 = v[i]*flat_time;
			double S3 = (v[i+1]+decel_time/2)*decel_time;
			S += S1+S2+S3;
		}
		System.out.println(S);

	}
}
