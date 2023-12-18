import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] firstT = new int[100001];
        int[] secondT = new int[100001];

        Set<Integer> first = new TreeSet<>();
        Set<Integer> second = new TreeSet<>();

        int partLength = n / 2;

        for (int i = 0; i < partLength; i++) {
            int f = sc.nextInt();
            first.add(f);
            firstT[f]++;
            int s = sc.nextInt();
            second.add(s);
            secondT[s]++;
        }

        long ans = Long.MAX_VALUE;

        for(Integer f : first) {
            long fRemove = partLength - firstT[f];
            for (Integer s : second) {
                long sRemove = partLength - secondT[s];
                if (f.equals(s)) {
                    sRemove = partLength;
                }
               ans = Math.min(ans, fRemove + sRemove);
            }
        }

        System.out.println(ans);
    }
}
