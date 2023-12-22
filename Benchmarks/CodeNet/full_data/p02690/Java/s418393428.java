import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> temp = new ArrayList<>();
        long tempNumber;
        for (long i = 0L; i < 150; i++) {
            tempNumber = i * i * i * i * i;
            temp.add(tempNumber);
            temp.add(-tempNumber);
        }
        temp.add(0L);
        long x = Long.parseLong(scanner.next());
        for (Long no : temp) {
            if (temp.contains(no - x)) {
                long b = no - x;
                long outA;
                long outB;
                if (no < 0) {
                    outA = (long)-Math.pow(-no,0.2);
                } else {
                    outA = (long)Math.pow(no,0.2);
                }
                if (b < 0) {
                    outB = (long)-Math.pow(-b,0.2);
                } else {
                    outB = (long)Math.pow(b,0.2);
                }
                System.out.println(outA + " " + outB);
                return;
            }
        }
    }

}