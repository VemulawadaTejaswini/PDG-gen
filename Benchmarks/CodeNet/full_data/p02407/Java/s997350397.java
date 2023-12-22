import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total = inp.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        while (count != total) {
            int num = inp.nextInt();

            list.add(num);

            count++;
        }

        ArrayList<Integer> listTemp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            listTemp.add(0, list.get(i));
        }

        for (int i = 0; i < listTemp.size(); i++) {
            if (i != listTemp.size()-1) {
                System.out.print(listTemp.get(i) + " ");
            } else {
                System.out.print(listTemp.get(i));
            }
        }

        System.out.print("\n");
    }
}

