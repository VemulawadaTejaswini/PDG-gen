import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        Long[] train = {Long.parseLong(sc.next()),
                Long.parseLong(sc.next()),
                Long.parseLong(sc.next()),
                Long.parseLong(sc.next()),
                Long.parseLong(sc.next())};

        Arrays.sort(train);
        long result = n % train[0] == 0 ? n / train[0] + 4 : n / train[0] + 5;

        System.out.println(result);
    }
}