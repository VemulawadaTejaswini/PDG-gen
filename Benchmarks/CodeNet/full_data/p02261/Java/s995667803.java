import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] cs = sc.nextLine().split(" ");
        String[] cfb = cs.clone();
        for (int i = 0; i < cfb.length; i++) {
            for (int j = cfb.length - 1; j > i; j--) {
                int vj = Integer.parseInt(cfb[j].substring(1));
                int vj_1 = Integer.parseInt(cfb[j - 1].substring(1));
                if (vj_1 > vj) {
                    String tmp = cfb[j];
                    cfb[j] = cfb[j - 1];
                    cfb[j - 1] = tmp;
                }
            }
        }
        System.out.println(Stream.of(cfb).collect(Collectors.joining(" ")));
        // Because Bubble sort is stable sort
        System.out.println("Stable");
        String[] cfs = cs.clone();
        for (int i = 0; i < cfs.length; i++) {
            int minj = i;
            for (int j = i; j < cfs.length; j++) {
                int vminj = Integer.parseInt(cfs[minj].substring(1));
                int vj = Integer.parseInt(cfs[j].substring(1));
                if (vminj > vj) {
                    minj = j;
                }
            }
            if (minj != i) {
                String tmp = cfs[minj];
                cfs[minj] = cfs[i];
                cfs[i] = tmp;
            }
        }
        System.out.println(Stream.of(cfs).collect(Collectors.joining(" ")));
        boolean isStable = true;
        for (int i = 0; i < cfb.length; i++) {
            if (cfb[i] != cfs[i]) {
                isStable = false;
                break;
            }
        }
        if (isStable) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }
}


