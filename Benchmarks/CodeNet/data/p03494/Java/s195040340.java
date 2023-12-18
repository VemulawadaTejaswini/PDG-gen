import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> xs = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            xs.add(scanner.nextInt());
        }

        int count = 0;
        while (true) {
            for (int i = 0; i < xs.size(); i++) {
                if (xs.get(i) % 2 == 0) {
                    xs.set(i, xs.get(i) / 2);
                }
                else {
                    System.out.println(count);
                    return;
                }
            }

            count++;
        }
    }
}

