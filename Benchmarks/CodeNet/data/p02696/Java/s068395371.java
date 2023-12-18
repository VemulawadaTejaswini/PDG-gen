import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double N = sc.nextDouble();
        double Nmax = N;

        while(B<Nmax) {
            Nmax--;
        }
        long ans = (long)Math.floor((A*Nmax)/B - A * Math.floor(Nmax/B));

		System.out.println(ans);
    }
}