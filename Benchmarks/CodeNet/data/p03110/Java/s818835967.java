

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] x = new double[n];
        String[] u = new String[n];
        for(int i=0;i<n;i++){
            x[i] = Double.parseDouble(sc.next());
            u[i] = sc.next();
        }
        double bit = 380000.0;
        double sum = 0;
        for(int i=0;i<n;i++){
            if(u[i].equals("BTC")){
                sum+=x[i]*bit;
            }else{
                sum+=x[i];
            }
        }

        System.out.println(sum);
        sc.close();

    }
    
}