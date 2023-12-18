import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Object ans = averageLength(n, x, y);
        System.out.println(ans);
    }


    private static double averageLength(int n, int[] x, int[] y){
        double distance = 0;
        int fac = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j<n; j++){
                fac++;
                distance += Math.sqrt(Math.pow((x[i]-x[j]), 2) +Math.pow((y[i]-y[j]), 2));
            }
        }
        return distance*(n - 1)/fac;
    }
}