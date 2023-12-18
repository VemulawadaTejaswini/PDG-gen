import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> abc = new ArrayList<>();
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        Collections.sort(abc);

        int count = 0;
        int diff21 = abc.get(2) - abc.get(1);
        abc.set(0, abc.get(0) + diff21);
        abc.set(1, abc.get(1) + diff21);
        count += diff21;

        int diff10 = abc.get(1) - abc.get(0);
        if (diff10 % 2 == 0) {
            count += diff10 / 2;
        } else {
            count += (diff10 + 1) / 2 + 1;
        }
        System.out.println(count);
    }

}
