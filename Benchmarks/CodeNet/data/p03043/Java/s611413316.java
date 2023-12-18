import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        double sum = 0;
        int count = 0;
        for(int i = 1; i <= a; i++){
            int c = i;
            double sum1 = 0;
            double d = 1 / (double)a;
            double res = 1;
            for(int j = 0; c < b; j++){
                c = c * 2;
                count++;
                res = res * (1 / (double)2);
                //System.out.println(res);
                //System.out.println(c);
                //System.out.println(count);
            }
            //double res = Math.pow(1 / 2, count);
            sum1 = d * res;
            //System.out.println(sum1);
            sum = sum + sum1;
        }
        System.out.println(sum);
    }
}