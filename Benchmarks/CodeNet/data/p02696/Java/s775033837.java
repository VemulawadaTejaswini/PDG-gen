import java.util.*;
public class Main {
    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int N = s.nextInt();
        double max = 0;

        for (int x = N; x >= 0; x--) {
            double n = Math.floor(A * x / B) - (A * Math.floor(x / B));
            if (n > max)
                max = n;
        }
        System.out.println(max);


    }



}
