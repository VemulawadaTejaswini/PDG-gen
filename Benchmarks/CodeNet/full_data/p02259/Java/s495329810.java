import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        boolean flag = true;
        int count = 0;
        while (flag) {
            flag = false;
            for (int j = n - 1; j >= 1; j--) {
                if (a.get(j) < a.get(j - 1)) {
                    int tmp = a.get(j);
                    a.set(j, a.get(j - 1));
                    a.set(j - 1, tmp);
                    count++;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            if (i != a.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println(count);
        scanner.close();
    }
}

