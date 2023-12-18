import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

        long array[] = new long[10002];

        for (int i = 0; i <= 5000; i++) {
            array[i] = i * i * i * i * i;
        }

        for (int i = 0; i <= 5000; i++) {
            array[i + 5001] = - (i * i * i * i * i);
        }

        for (int i = 0; i < 10002; i++) {
            for (int j = 0; j < 10002; j++) {
                if (array[i] - array[j] == x) {
                    if (i >= 5001) {
                        i = -i + 5001;
                    }

                    if (j >= 5001) {
                        j = -j + 5001;
                    }

                    System.out.println(String.valueOf(i) + " " + String.valueOf(j));
                    return;
                }

            }
        }




        sc.close();
    }

}