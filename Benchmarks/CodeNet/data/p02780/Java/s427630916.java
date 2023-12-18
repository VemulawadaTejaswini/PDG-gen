import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        double p;
        double[] d = new double[n];
        for(int i = 0; i < n; i++){
            p = Double.parseDouble(sc.next());
            d[i] = (p+1)/2;
        }
        
        double a = 0;
        for(int i = 0; i < k; i++){
            a += d[i];
        }
        double max = a;
        for(int i = k; i < n; i++){
            a -= d[i-k];
            a += d[i];
            if(a > max) max = a;
        }
        
        System.out.println(max);
    }
}