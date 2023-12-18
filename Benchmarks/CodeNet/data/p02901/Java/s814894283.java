
import java.util.*;
public class Main {
    static long min = Long.MAX_VALUE;
    static int n;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = in.nextInt();

        Key[] a = new Key[m];
        for (int i = 0; i < m; i++) {

            int val = in.nextInt();
            int boxes = in.nextInt();
            Key tmp = new Key(val, new ArrayList<Integer>());
            for (int j = 0; j < boxes; j++) {

                tmp.al.add(in.nextInt());

            }
            a[i] = tmp;

        }

        subset(a);
        if (min == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }

    }

    static void subset(Key[] arr) {
        int size = arr.length;
        for (int i = 0; i < (1<<size); i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            long cost = 0;
            for (int j = 0; j < size; j++) {
                if (((1 << j) & i)!= 0) {

                    for (Integer integer:arr[j].al
                         ) {
                        set.add(integer);
                    }
                    cost += arr[j].val;
                }
            }
               if (set.size() == n) {
                   min = Math.min(min, cost);
               }
        }
    }

    static class Key{

        int val;
        ArrayList<Integer> al;

        public Key(int val, ArrayList<Integer> al) {
            this.val = val;
            this.al = al;
        }
    }

}
