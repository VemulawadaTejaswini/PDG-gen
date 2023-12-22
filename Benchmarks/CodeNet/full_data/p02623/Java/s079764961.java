import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        Arrays.setAll(a, i -> sc.nextLong());
        Arrays.setAll(b, i -> sc.nextLong());
        sc.close();
        ArrayList<Long> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if (a[i] <= b[j]) {
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }
        if (i < n) {
            while(i < n) {
                list.add(a[i]);
                i++;
            }
        }
        if (j < m) {
            while(j < m) {
                list.add(b[j]);
                j++;
            }
        }

        long sum = 0;
        int cnt = 0;
        for (int x = 0; x < list.size(); x++) {
            if (sum + list.get(x) <= k) {
                sum += list.get(x);
                cnt++;
            }
            else break;
        }
        
        System.out.println(cnt);
    }
}

