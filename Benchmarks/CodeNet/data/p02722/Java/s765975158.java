import java.util.*;

public class Main {

static List<Long> divisor(long n) {
    List<Long> list = new ArrayList<Long>();
    for (int i=1;i<=Math.sqrt(n);i++) {
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
        ArrayList<Long> list = new ArrayList<Long>(divisor(N-1));
        System.out.println(list.size()+1);
    }
}