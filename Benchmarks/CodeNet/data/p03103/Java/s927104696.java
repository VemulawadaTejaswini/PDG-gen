

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        List<Long> kingakuq = new ArrayList<>();
        HashMap<Long, Long> dic = new HashMap<>();
        for (int i = 0; i < n; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            kingakuq.add(a);
            dic.put(a, b);
        }

        kingakuq = kingakuq.stream().sorted().collect(Collectors.toList());
        long sum = 0;
        int index = 0;
        while (true) {
            if (m <= 0) break;
            long syou = kingakuq.get(index);
            long hon = dic.get(syou);
            if (hon <= m) {
                m -= hon;
                sum += syou * hon;
            } else {
                sum += syou * m;
                m = 0;
            }
            index++;
        }
        System.out.println(sum);
    }

}
