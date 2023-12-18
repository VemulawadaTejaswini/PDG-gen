import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        long array[] = new long[2002];

        for (int i = 0; i <= 1000; i++) {
            array[i] = i * i * i * i * i;
        }

        for (int i = 0; i <= 1000; i++) {
            array[i + 1001] = - (i * i * i * i * i);
        }

        for (int i = 0; i < 2002; i++) {
            for (int j = 0; j < 2002; j++) {
                if (array[i] - array[j] == x) {
                    if (i >= 1000) {
                        i = -i + 1001;
                    }

                    if (j >= 1000) {
                        j = -j + 1001;
                    }

                    System.out.println(String.valueOf(i) + " " + String.valueOf(j));
                    return;
                }

            }
        }




        sc.close();
    }

}