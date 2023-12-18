import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Long> list = new LinkedList<>();
        LinkedList<Long> list2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            list.add(tmp);
            list2.add(tmp);
        }
        int index = n / 2 -1;
        Collections.sort(list2);
        for (int i = 0; i < n; i++) {
            LinkedList<Long> list3 = (LinkedList<Long>) list2.clone();
            list3.remove(list.get(i));
            System.out.println(list3.get(index));
        }
    }
}