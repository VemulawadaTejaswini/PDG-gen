import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int[] s = new int[n];
            double m = 0;
            for (int i = 0; i < n; i++) {
                s[i] = scan.nextInt();
                m += s[i];
            }
            m /= n;
            double sum = 0;
            for(int i = 0; i < s.length; i++){
            	sum += (s[i] - m) * (s[i] - m);
            }
            System.out.println(Math.sqrt(sum/n));
        }
    }
}