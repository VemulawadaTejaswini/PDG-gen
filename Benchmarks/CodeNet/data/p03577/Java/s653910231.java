import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            aList.add(scanner.nextInt());
        }

        int b = scanner.nextInt();
        ArrayList<Integer> bList = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            bList.add(scanner.nextInt());
        }

        if (a < b) {
            System.out.println("NO");
            return;
        }

        for (int s : bList) {
            int index = aList.indexOf(s);

//            System.out.println(s);
            if (index == -1) {
                System.out.println("NO");
                return;
            }

            aList.remove(index);
        }

        System.out.println("YES");
    }

}