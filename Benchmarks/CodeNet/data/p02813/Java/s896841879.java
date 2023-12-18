import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rp = rank(n, sc);
        int rq = rank(n, sc);
        System.out.println(Math.abs(rp - rq));
    }

    static int fact(int n) {
        int result = n;
        for(int i = 1; i < n; i++) result *= i;
        return result;
    }
    static int rank(int n, Scanner sc) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) arr.add(i);
        int result = 1;
        for(int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if(i == n - 1) break;
            if(arr.indexOf(p) != 0) result += fact(arr.size() - 1) * arr.indexOf(p);
            arr.remove(Integer.valueOf(p));
        }
        return result;
    }
}
