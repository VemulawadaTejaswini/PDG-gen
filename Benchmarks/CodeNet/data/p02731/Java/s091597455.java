import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        double hen = l / 3;

        if (hen + hen + hen == l) {
            System.out.println(hen * hen * hen);
        } else {
            double diff = l - (hen + hen + hen);
            System.out.println((hen + diff) * hen * hen);
        }
    }
}