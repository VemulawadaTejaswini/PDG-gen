import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        double sum = 0.0;
        
        ArrayList<Integer> scores = new ArrayList<Integer>();
        while (true) {
            n = scanner.nextInt();
            if ( n == 0) {
                break;
            }
            
            int score = 0;
            for (int i = 0; i < n; i++) {
                score = scanner.nextInt();
                scores.add(new Integer(score));
                sum += score;
            }
            double average = sum / n;
            double variance = 0;
            
            for (int i = 0; i < n; i++) {
                variance += Math.pow(scores.get(i)-average, 2);
            }
            variance /= n;
            double stddev = Math.sqrt(variance);

            System.out.println(stddev);
        }
    }
}