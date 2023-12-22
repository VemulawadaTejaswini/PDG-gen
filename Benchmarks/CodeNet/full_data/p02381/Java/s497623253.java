import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            int n = scan.nextInt();
            if(n == 0) {
                break;
            }
            
            double[] s = new double[n];
            double sum = 0;
            for(int i = 0; i < n; i++) {
                s[i] = scan.nextDouble();
                sum += s[i];
            }
            
            double m = sum / n;
            double sigma_result = 0;
            for(int i = 0; i < n; i++) {
                sigma_result += Math.pow(s[i] - m, 2);
            }
            
            double a2 = sigma_result / n;
            double a = Math.sqrt(a2);

            System.out.println(a);
        }
    }
}

