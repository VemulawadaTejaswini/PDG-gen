import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();

        boolean isHanten = false;

        List<String> list = new LinkedList<>();
        list.add(s);

        for (int i = 0; i < q; i++) {
            int f = sc.nextInt();
            if (f == 1) {
                isHanten = !isHanten;
            } else {
                if (sc.nextInt() == 1) {
                    if (isHanten) {
                        list.add(sc.next());
                    } else {
                        list.add(0, sc.next());
                    }
                } else {
                    if (isHanten) {
                        list.add(0, sc.next());
                    } else {
                        list.add(sc.next());
                    }
                }
            }
        }
        if (isHanten) {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i));
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
    }
}
