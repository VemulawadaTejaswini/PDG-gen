import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ngupta
 * Date: 4/5/2020 AD
 * Time: 23:41
 */
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().trim().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < K; i++) {
            br.readLine();
            String[] snukes = br.readLine().trim().split(" ");
            for (String sn : snukes)
                set.add(Integer.parseInt(sn));
        }

        System.out.println(N - set.size());
    }
}
