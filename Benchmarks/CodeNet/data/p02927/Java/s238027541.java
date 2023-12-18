import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String inputs = s.nextLine();
        String[] strings = inputs.split(" ");

        if (strings.length < 2) {
            System.out.println("0");
        }

        //合計の月
        int M = Integer.valueOf(strings[0]);

        //1ヶ月当たりの均等日付
        int D = Integer.valueOf(strings[1]);


        int counter = 0;
        for (int m = 1; m <= M; m++) {
            for (int i = 22; i <= D; i++) {
                if (i % 10 < 2) continue;
                int d10 = i / 10;
                int d1  = i % 10;
                if (d10 * d1 == m) counter++;
            }
        }

        System.out.println(counter);


    }
}
