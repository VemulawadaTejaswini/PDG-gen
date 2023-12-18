
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kushi = sc.nextInt();

        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        for (int i = 0, max = kushi * 2; i < max; i++) {
            int n = sc.nextInt();
            lengthList.add(n);

        }
        Collections.sort(lengthList);

        int tot = 0;
        for (int i = 0; i < lengthList.size(); i+=2) {
            tot += lengthList.get(i);
        }

        System.out.println(tot);
    }
}