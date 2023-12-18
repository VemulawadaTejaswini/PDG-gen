import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double m = sc.nextDouble();
            if (sc.next().charAt(0) == 'J') {
                sum += m;
            } else {
                sum += m * 380000;
            }
        }

        System.out.println(sum);
    }
}
