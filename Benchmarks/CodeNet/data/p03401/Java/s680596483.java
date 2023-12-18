import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        Integer[] a = new Integer[n];

        for(int i=0;i < n;i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        for(int i=0;i < n;i++) {
            int answer = 0;
            List<Integer> route = new ArrayList<>();
            route.addAll(Arrays.asList(a));
            route.remove(i);
            for (int j=0;j < n;j++) {
                if (j==0) {
                    answer += Math.abs(0 - route.get(j));
                } else if (j==n-1) {
                    answer += Math.abs(0 - route.get(route.size()-1));
                } else {
                    answer += Math.abs(route.get(j-1) - route.get(j));
                }
            }
            System.out.println(answer);
        }
    }
}
