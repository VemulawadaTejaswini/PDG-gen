import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    private void topThreeHills() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> hlist = new ArrayList<Integer>(10);
        while (sc.hasNext()) {
            hlist.add(sc.nextInt());
        }
        Collections.sort(hlist, Collections.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.println(hlist.get(i));
        }
    }

    public static void main(String[] args) {
        (new Main()).topThreeHills();
    }
}