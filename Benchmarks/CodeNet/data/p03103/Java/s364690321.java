
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        List<int[]> kingakuq = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            kingakuq.add(new int[]{a, b});
        }

        kingakuq = kingakuq.stream().sorted((a,b) -> a[0] - b[0]).collect(Collectors.toList());
        long sum = 0;
        int index = 0;
        while (true) {
            if (m <= 0) break;
            long syou = (long)(kingakuq.get(index)[0]);
            long hon = (long)(kingakuq.get(index)[1]);
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
