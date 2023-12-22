import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        for (int i = 1; i < 99; i++) {
            long pow = (long) Math.pow(26, +1);
            if (input <= pow) input -= pow;
        }
        char charA = "a".toCharArray()[0];
        List<Integer> c = convertToNBaseNum(input, 26);
        String str = c.stream().map(m -> String.valueOf((char) (charA + m - 1))).collect(Collectors.joining());
        System.out.println(str);
    }

    public static List<Integer> convertToNBaseNum(long input, int n) {
        List<Integer> nBaseList = new ArrayList<>();
        while (input > 0) {
            nBaseList.add(0, (int) (input % n));
            input = input / n;
        }
        return nBaseList;
    }
}
