import java.util.*;
import java.util.stream.Collectors;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int tmp = 0; tmp < n; tmp++){
            list.add(sc.nextInt());
        }

        List<Integer> rest = new ArrayList<>();
        rest.add(list.get(n - 1));
        int max = list.get(n - 1);
        for(int tmp = n - 2; tmp >= 0; tmp--){
            int a = list.get(tmp);

            if(a > max){
                max = a;
            }

            if(max > a){
                rest.remove((Integer) max);
                if(rest.size() > 0) {
                    Collections.sort(rest);
                    max = rest.get(rest.size() - 1);

                }else{
                    max = a;
                }
            }

            rest.add(a);
        }

        System.out.println(rest.size());
    }
}
