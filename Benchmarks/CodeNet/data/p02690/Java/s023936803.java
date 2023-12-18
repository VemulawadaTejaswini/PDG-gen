import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if(x % i == 0){
                set.add(i);
                set.add(x / i);
            }
        }
        long a = -1;
        long b = -1;
        for (int i = 0; i < 100000; i++) {
            for(int p : set){
                int tb = p - i;
                long t = (long) (Math.pow(i, 5) - Math.pow(tb, 5));
                if(t == x){
                    a = i; b = tb;
                    break;
                }
            }
            if(0 < a)break;
        }
        System.out.println(a + " " + b);
        sc.close();

    }

}
