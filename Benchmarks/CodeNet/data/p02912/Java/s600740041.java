import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int purchase = sc.nextInt();
        int ticket = sc.nextInt();
        List<Double> eachAmount = new ArrayList<>();
        for (int i = 0; i < purchase; i++) {
            eachAmount.add((double)sc.nextInt());
        }
        sc.close();
        for (int i = 1; i <= ticket; i++) {
            Collections.sort(eachAmount, Collections.reverseOrder());
            double max = eachAmount.get(0);
            eachAmount.set(0, max / 2);
        }
        long sum = 0;
        for (double amount : eachAmount) {
            sum += Math.floor(amount);
        }
        System.out.println(sum);
    }
}