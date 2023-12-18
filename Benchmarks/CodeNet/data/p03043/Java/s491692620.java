import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double K = sc.nextDouble();

        double sum = 0;
        for (int i=1; i<N+1; i++) {
            double posibility = 1/N;
            if (i > K-1) {
                sum += posibility;
                continue;
            } else {
                double d = K/i;

                for (int j=0; j<15; j++) {
                    if (d < Math.pow(2, j)) {
                        sum += posibility / Math.pow(2, j);
                        break;
                    }
                }
                continue;
            }
        }
        System.out.println(sum);
    }
}

