import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int tmp= 0; tmp < n;tmp++){
            int l = sc.nextInt();
            list.add(l);
        }

        int height = 0;
        int result = 1;
        int i = 0;
        while(height <= x && i < n){
            height += list.get(i);
            if(height <= x){
                result++;
            }
            i++;
        }

        System.out.println(result);
    }
}
