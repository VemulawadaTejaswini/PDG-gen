import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>(num);
        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }

        list.sort(Comparator.reverseOrder());
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += list.get(i/2);
        }
        System.out.print(sum);
    }
}
