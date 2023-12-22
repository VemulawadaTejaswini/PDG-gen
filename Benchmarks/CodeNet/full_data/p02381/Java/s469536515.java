import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            int[] array_s = new int[n];
            int sum = 0;
            double v_2 = 0;
            double a;
            for(int i = 0; i < n; i++){
                array_s[i] = scan.nextInt();
                sum += array_s[i];
            }

            double m = (double)sum/(double)n;

            for(int i = 0; i < n; i++){
                v_2 += Math.pow(array_s[i]-m, 2);
            }

            a = Math.sqrt(v_2/n);
            System.out.println(a);
        }

    }
}

