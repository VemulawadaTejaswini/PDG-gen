import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String O = scanner.next();
        String E = scanner.next();


        for(int i=0; i<O.length(); i++){
            System.out.print(O.charAt(i));
            if(i < E.length()){
                System.out.print(E.charAt(i));
            }
        }

        System.out.println();
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
