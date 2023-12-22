import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var n = scaner.nextInt();

        var a_list = new int[n];
        for (int i = 0; i < n; i++) {
            a_list[i] = scaner.nextInt();
        }

        var ans = 0;
        for (int i = 0; i < n; i++) {
            var ai = a_list[i];
            var isDivisible = false;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                var aj = a_list[j];
                isDivisible = isDivisible || ai % aj == 0;
            }
            if (!isDivisible) ans++;
        }

        System.out.println(ans);

        scaner.close();
    }

}
