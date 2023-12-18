import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<String> ll = new LinkedList<String>();

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                ll.addFirst(sc.next());
            } else {
                ll.addLast(sc.next());
            }
        }
        sc.close();

        ll.stream().forEach(s -> System.out.print(s + " "));

    }
}