import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double jpy = 0;
        double btc = 0;

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");

            if (arr[1].equals("JPY"))
                jpy += Double.parseDouble(arr[0]);
            else
                btc += Double.parseDouble(arr[0]);
        }

        jpy = btc * 380000 + jpy;
        System.out.println(jpy);
    }
}