import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int k = scn.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        if (a > 0) {
            for (int i = 0; i < a ; i++) {
                list.add(1);
            }
        }
        if (b > 0) {
            for (int i = 0; i < b ; i++) {
                list.add(0);
            }
        }
        if (c > 0) {
            for (int i = 0; i < c ; i++) {
                list.add(-1);
            }
        }
        if (list.size() == 0) {
            System.out.println(0);
        } else {
            Collections.sort(list);
            Collections.reverse(list);
            List<Integer> sublist = list.subList(0, k);
            int total = 0;
            for(int i : sublist) {
                total = total + i;
            }
            System.out.println(total);
        }
    }
}
