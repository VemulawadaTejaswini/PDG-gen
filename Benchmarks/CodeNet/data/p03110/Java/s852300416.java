import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Double[] x = new Double[N];
        String[] u = new String[N];
        int sum1 = 0;
        Double sum2 = 0.0;
        for(int i=0; i<N; i++) {
            x[i] = Double.parseDouble(sc.next());
            u[i] = sc.next();
            if(u[i].equals("JPY")) {
                sum1 += x[i];
            }else {
                sum2 += x[i]*380000.0;
            }
        }
        System.out.println(sum1+sum2);
    }
}