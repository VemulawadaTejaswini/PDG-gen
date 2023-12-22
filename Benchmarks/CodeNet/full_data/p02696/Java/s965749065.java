import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double N = sc.nextDouble();
        double Nmax = N;

        if(B<Nmax){
            Nmax = B - 1;
        }
        long ans1 = (int)((A*Nmax)/B);
        long ans2 = (long)A * (int)(Nmax/B);
        long ans3 = ans1 - ans2;
        System.out.println(ans3);
        
        /*public static int floor(double a){
            a += 0.5;
            if(a > 0) return((int)a);
            else return((int)a - 1);
        }*/
    }
}