import java.util.*;

public class Main {

    static List<Long> divisor(long n) {
        List<Long> list = new ArrayList<Long>();
        for (long i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                list.add((long)i);
                if (i*i!=n) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        ArrayList<Long> list_2 = new ArrayList<Long>(divisor(N));
        int ans = 0;
        for (int i=0;i<list_2.size();i++) {
            long tmp = N;
            if (list_2.get(i)==1) continue;

            while (tmp%list_2.get(i)==0) {
                tmp = tmp/list_2.get(i);
            }
            if (tmp%list_2.get(i)==1) ans++;
        }
        ArrayList<Long> list = new ArrayList<Long>(divisor(N-1));
        System.out.println(ans+list.size()-1);
    }
}