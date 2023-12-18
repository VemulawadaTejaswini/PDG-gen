import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        List<Long> list1 = new ArrayList<Long>();
        List<Long> list2 = new ArrayList<Long>();
        
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextLong();
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                list1.add(a[i] + b[j]);
            }
        }
        Collections.sort(list1, Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < z; j++) {
                list2.add(list1.get(i) + c[j]);
            }
        }
        Collections.sort(list2, Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
            System.out.println(list2.get(i));
        }
    }
}
