import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i=0; i<=100; i++){
            for(int j=0; j<=100; j++){
                if(N == i*4 + j*7){
                    System.out.println("Yes");
                    return;
                }

            }
        }

        System.out.println("No");
        return;

    }

    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i]) continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) list.add(i);
        }

        return list;
    }
}
