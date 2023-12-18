
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.asList(1, 9, 7, 4);

        Integer n1 = sc.nextInt();
        Integer n2 = sc.nextInt();
        Integer n3 = sc.nextInt();
        Integer n4 = sc.nextInt();
        Integer count = 0;

        //list.forEach(num -> {
        //    if (num == n1 || num == n2 || num == n3 || num == n4) {
        //        count += 1;
        //    }
        //});

        for (Integer num : list) {
            if (num == n1 || num == n2 || num == n3 || num == n4) {
                count += 1;
            }
        }

        if (count == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}