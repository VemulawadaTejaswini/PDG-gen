import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double N = sc.nextDouble();

        if(B<=N){
            if(N != 1) N = B - 1;
        }
        long ans1 = (int)((A*N)/B);
        long ans2 = (long)A * (int)(N/B);
        long ans3 = ans1 - ans2;
        System.out.println(ans3);

    }
}