import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) { break; }
            int[] scores = new int[n];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt();
                sum = sum + scores[i];
            }
            double average = 0, variance = 0,sumv =0,b=0;
            average = sum / scores.length;
            for(int a=0;a<scores.length;a++){
               b  = (scores[a]-average)*(scores[a]-average);
               sumv =  sumv + b;
            }
            variance = sumv / scores.length;
            System.out.println(Math.sqrt(variance));
        }
    }
}