import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        String a[] = new String[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.next() + inp.nextInt();
        }

        quicksort(a, 0, total-1);

        validate(a);

        for (String item : a){
            String i = item.substring(0, 1) + " " + item.substring(1);
            System.out.print(i + "\n");
        }
    }

    public static void validate(String[] a) {
        ArrayList<String> check = new ArrayList<>();
        String c = "";
        int currentNum = 0;
        for (int i = 0; i < a.length; i++) {
            int num = Integer.parseInt(a[i].substring(1));

            if (currentNum != num) {
                currentNum = num;
                if (c != "") {
                    check.add(c);
                }
                c = "";
            }

            c += a[i].substring(0,1);
        }

        check.add(c);

        String last = "";
        for (String txt : check) {
            if (last.equals("")) {
                last = txt;
            } else if(!txt.equals(last)) {
                System.out.println("Not stable");
                return;
            }
        }

        System.out.println("Stable");
    }

    public static int partition(String[] a, int p, int r) {
        String x = a[r];
        int i = p-1;
        for (int j = p; j < r; j++) {
            int num1 = Integer.parseInt(a[j].substring(1));
            int num2 = Integer.parseInt(x.substring(1));
            if (num1 <= num2) {
                i = i+1;
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        String temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;

        return i+1;
    }

    public static void quicksort(String[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);

            quicksort(a, p, q-1);
            quicksort(a, q+1, r);
        }
    }
}

