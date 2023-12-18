import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            java.util.Scanner data = new Scanner(System.in);
            int n = Integer.parseInt(data.next());
            double money = 0;
            double sum = 0;
            // ArrayList<Integer> jpy = new ArrayList<Integer>();
            // ArrayList<Double> btc = new ArrayList<Double>();
            for (int i=0; i<n; i++) {
                money = Double.parseDouble(data.next());
                String type = data.next();
                System.out.println(money);
                System.out.println(type);
                if (type == "JPY"){
                    sum = sum + money;
                } else {
                    sum = sum + money * 380000.0;
                }
            }
            System.out.println(sum);
        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }

    Main() {

    }
}