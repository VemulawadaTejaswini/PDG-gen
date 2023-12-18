import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int secondMax = 0;
        List<Integer> list = new ArrayList<>();
        for(int tmp = 0; tmp < n ; tmp++){
            int a = sc.nextInt();
            list.add(a);
            if(max < a){
                max = a;
            }else {
                if (secondMax < a) {
                    secondMax = a;
                }
            }
        }
        for(int tmp =0; tmp < n; tmp++){
            int b = list.get(tmp);
            if(b == max){
                System.out.println(secondMax);
            }else{
                System.out.println(max);
            }
        }
    }
}
