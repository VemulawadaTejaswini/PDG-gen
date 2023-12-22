import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total = inp.nextInt();

        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> h = new ArrayList<>();

        int count = 0;

        while (count != total) {
            String ch = inp.next();
            int num = inp.nextInt();

            if (ch.equals("S")) {
                s.add(num);
            }

            if (ch.equals("H")) {
                h.add(num);
            }

            if (ch.equals("D")) {
                d.add(num);
            }

            if (ch.equals("C")) {
                c.add(num);
            }

            count++;
        }

        ArrayList<Integer> sMissing = new ArrayList<>();
        ArrayList<Integer> cMissing = new ArrayList<>();
        ArrayList<Integer> dMissing = new ArrayList<>();
        ArrayList<Integer> hMissing = new ArrayList<>();

        for (int i = 1; i <= 13; i++) {
            if (!(s.contains(i))) {
                sMissing.add(i);
            }

            if (!(h.contains(i))) {
                hMissing.add(i);
            }

            if (!(d.contains(i))) {
                dMissing.add(i);
            }

            if (!(c.contains(i))) {
                cMissing.add(i);
            }
        }

        for (int i : sMissing) {
            System.out.println("S " + i);
        }
        for (int i : hMissing) {
            System.out.println("H " + i);
        }
        for (int i : cMissing) {
            System.out.println("C " + i);
        }
        for (int i : dMissing) {
            System.out.println("D " + i);
        }
    }
}

