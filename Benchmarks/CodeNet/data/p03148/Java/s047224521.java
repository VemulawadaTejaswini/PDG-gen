
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int selectSushis = sc.nextInt();

        long[] toppings = new long[N];
        long[] deliciousness = new long[N];
        for (int i = 0; i < N; i++) {
            toppings[i] = sc.nextInt();
            deliciousness[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(sushi(N, selectSushis, toppings, deliciousness));
    }

    private static int sushi(int N, int selectSushis, long toppings[], long deliciousness[]) {
        if(selectSushis > N) return -1;
        int tasty = 0;
        Set<Long> integerSet = new HashSet<>();
        for(int i= 0; i<selectSushis;i++) {
            tasty+=deliciousness[i];
            integerSet.add(toppings[i]);
        }

        return tasty + (integerSet.size() * integerSet.size());
    }

}