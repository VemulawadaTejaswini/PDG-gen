import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        String linex = sc.nextLine();
        String liney = sc.nextLine();
        String[] linexsp = linex.split(" ");
        String[] lineysp = liney.split(" ");
        int[] x = new int[n];
        int[] y = new int[n];
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double max = 0;
        for(int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(linexsp[i]);
            y[i] = Integer.parseInt(lineysp[i]);
            double dif = x[i] - y[i];
            if(dif < 0) {
                dif = -dif;
            }
            if(i == 0) {
                max = dif;  
            }
            if(max < dif) {
                max = dif;
            }
            sum1 += dif;
            sum2 += Math.pow(dif, 2);
            sum3 += Math.pow(dif, 3);
        }
        System.out.println(sum1);
        System.out.println(Math.sqrt(sum2));
        System.out.println(Math.cbrt(sum3));
        System.out.println(max);
        
    }
 }
