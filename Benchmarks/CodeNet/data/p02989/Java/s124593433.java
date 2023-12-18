
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());

        Integer[] d =  new Integer[a];

        for(int i = 0; i < a; i++) {
            d[i] = Integer.parseInt(scanner.next());
        }
        Arrays.sort(d);

        int half = d.length / 2;
        int start = d[half-1];
        int end = 0;

        if(!(start == d[half])) {
            end = d[half];
            System.out.println(Math.abs(start-end));
        } else {
            System.out.println(0);
        }

    }
}
