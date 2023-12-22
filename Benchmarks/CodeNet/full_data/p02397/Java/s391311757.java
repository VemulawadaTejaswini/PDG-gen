import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner inp = new Scanner(System.in);

        int end = 1;
        while (end != 0) {
            int num1 = inp.nextInt();
            int num2 = inp.nextInt();

            if (num1 == 0 && num2 == 0) {
                end = 0;
            } else {
                list1.add(num1);
                list2.add(num2);
            }
        }

        /*
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list2.get(i) + " " + list1.get(i));
        } */

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > list2.get(i)) {
                int temp = list1.get(i);

                list1.remove(i);
                list1.add(i, list2.get(i));

                list2.remove(i);
                list2.add(i, temp);
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) + " " + list2.get(i));
        }
    }
}
