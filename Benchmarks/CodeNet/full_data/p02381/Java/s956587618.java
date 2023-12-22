import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0) break;
            List<Integer> list = new ArrayList<Integer>();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int s = input.nextInt();
                list.add(s);
                sum += s;
            }
            double avg = (double)sum / list.size();
            double a = 0;
            for (int s : list) {
                a += Math.pow(s - avg, 2);
            }
            System.out.println(Math.sqrt(a / list.size()));
        }
    }
}