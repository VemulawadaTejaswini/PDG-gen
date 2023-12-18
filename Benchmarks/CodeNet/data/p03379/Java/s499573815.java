import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        int index = n / 2 -1;
        for (int i = 0; i < n; i++) {
            ArrayList<Long> list2 = new ArrayList<>();
            list2 = (ArrayList<Long>) list.clone();
            list2.remove(i);
            Collections.sort(list2);
            System.out.println(list2.get(index));
        }
    }
}