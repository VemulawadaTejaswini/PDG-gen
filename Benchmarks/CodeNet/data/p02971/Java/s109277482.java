import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        for(int i=0; i<n; i++) {
            List<Integer> list2 = new ArrayList<>();
            list2.addAll(list);
            list2.remove(list.get(i));
            Collections.sort(list2);
            Collections.reverse(list2);
            System.out.println(list2.get(0));
        }
    }
}