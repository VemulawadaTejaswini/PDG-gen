import java.util.Scanner;

class Otoshidama {
    double value;
    String currency;
    public Otoshidama(String v, String cur) {
        this.value = Double.parseDouble(v);
        this.currency = cur;
    }

    double toYen() {
        double res = this.value;
        if (currency.equals("BTC")) {
            res = this.value * 380000;
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // これよくわからん
        double sum = 0;

        for (int i = 0; i < n; i++) {
            String[] in = sc.nextLine().split(" ");
            sum += (new Otoshidama(in[0], in[1])).toYen();
        }

        System.out.println(sum);

    }
}
