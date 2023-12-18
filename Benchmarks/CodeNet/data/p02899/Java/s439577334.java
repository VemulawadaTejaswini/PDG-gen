import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static class El implements Comparable<El> {
        int i;
        int A;
        public El(int i, int A) {
            this.i = i;
            this.A = A;
        }

        @Override
        public int compareTo(El o) {

            if(this.A < o.A) {
                return -1;
            } else if(this.A == o.A) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        int N = sc.nextInt();

        ArrayList<El> arr = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            arr.add(new El(i, sc.nextInt()));
        }

        arr = arr.stream().sorted().collect(Collectors.toCollection(ArrayList::new));

        for(El e : arr) {
            System.out.printf("%d ", e.i);
        }
    }
}
//[B@25618e91
//[B@326de728
//