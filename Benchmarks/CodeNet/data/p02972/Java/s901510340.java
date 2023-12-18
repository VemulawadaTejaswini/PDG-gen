import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            a[i] = sc.nextInt();
        }
        int[] hako = new int[N+1];
        List<Integer> dolist = new ArrayList<>();
        for (int i = N; i >= 1; i--) {
            if (!goodState(hako, i, a[i])) {
                dolist.add(i);
                hako[i] = 1;
            }
        }
        System.out.println(dolist.size());
        for (Integer e : dolist) {
            System.out.print(e + " ");
        }
    }

    public static boolean goodState(int[] hako, int n, int amari) {
        int size = hako.length;
        int index = n;
        int bai = 1;
        int count = 0;
        while (index < size) {
            if (hako[index] == 1) {
                count = (count + 1) % 2;
            }
            bai++;
            index = n*bai;
        }
        if (count == amari) {
            return true;
        } else {
            return false;
        }
    }
}