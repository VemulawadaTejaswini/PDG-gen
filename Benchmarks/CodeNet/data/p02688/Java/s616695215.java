import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ngupta
 * Date: 4/5/2020 AD
 * Time: 23:41
 */
class Main {
  
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < K; i++) {
            sc.nextLine();
            String[] snukes = sc.nextLine().trim().split(" ");
            for (String sn : snukes)
                set.add(Integer.parseInt(sn));
        }

        System.out.println(N - set.size());
    }
}
