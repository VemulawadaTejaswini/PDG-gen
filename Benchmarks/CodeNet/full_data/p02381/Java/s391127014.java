import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        double vars = 0;
        String num = scan.readLine();
        int number = Integer.parseInt(num);

        while(number != 0) {
            String[] str = scan.readLine().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(str[i]);
                sum += a[i];
            }
            double ave = sum / a.length;
            for(int i = 0; i < a.length; i++) {
                 vars += pow(a[i] - ave,2);
            }
            double std = Math.sqrt(vars / a.length);
             System.out.printf("%.8f\n",std);
             num = scan.readLine();
             number = Integer.parseInt(num);
        }
    }
}