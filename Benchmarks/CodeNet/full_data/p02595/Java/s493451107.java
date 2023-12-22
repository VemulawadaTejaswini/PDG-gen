  import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double distance = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
            if (distance <= D)
                count++;
        }
        sc.close();
 
        System.out.println(count);
    }
}