import java.util.*;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for(int tmp = 0; tmp<n; tmp++){
            long a = sc.nextLong();
            list.add(a);
        }
        Collections.sort(list);

        for(int tmp = 0; tmp< m; tmp++){
            long b = sc.nextInt();
            long c = sc.nextInt();

            for(int tmp2 = 0; tmp2 < b; tmp2++){
                if(list.get(tmp2) < c){
                    list.set(tmp2, c);
                }else {
                    break;
                }
            }
            Collections.sort(list);
        }

        long sum = list.stream().mapToLong(x -> x).sum();
        System.out.println(sum);
    }
}
