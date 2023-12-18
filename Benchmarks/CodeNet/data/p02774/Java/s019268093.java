
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();

        int A [] = new int[200001];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                String key = i < j ? i + ":" + j : j + ":" + i;
                if (map.containsKey(key)) {
                    continue;
                }
                map.put(key, new BigDecimal(A[i]).multiply(new BigDecimal(A[j])));
            }
        }

        List<BigDecimal> al = new ArrayList<BigDecimal>();
        for (Entry<String, BigDecimal> a : map.entrySet()) {
            al.add(a.getValue());
        }

        System.out.println(al.stream().sorted().collect(Collectors.toList()).get(K - 1));


    }

}
