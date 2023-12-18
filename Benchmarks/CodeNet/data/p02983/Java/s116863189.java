import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());

        sc.close();

        int mod2019;
        int min = 2*10^9;

        for (int i = L; i < R; i++) {

            for (int j = i+1; j <= R; j++) {

                mod2019 = i*j%2019;

                if (min > mod2019) {

                    min = mod2019;
                }
            }
        }

        System.out.println(min);
    }

}