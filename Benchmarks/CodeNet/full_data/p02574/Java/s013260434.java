import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int g = gcd(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            g = gcd(g, a[i]);
        }
        Set<Integer> set = new HashSet<>();
        boolean pc = true;
        for (int i = 0; i < n; i++) {
            if(!pc) break;
            int tmp = a[i];
            for (int j = 2; j < Math.sqrt(a[i]); j++) {
                boolean hasj = false;
                while(tmp % j == 0){
                    hasj = true;
                    tmp /= j;
                }
                if(hasj && set.contains(j)){
                    pc = false; break;
                }
                if(hasj) set.add(j);
                if(tmp == 1) break;
            }
            if(tmp != 1){
                if(set.contains(tmp)) pc = false;
                else set.add(tmp);
            }
        }
        if(pc)  System.out.println("pairwise coprime");
        else if(g == 1) System.out.println("setwise coprime");
        else System.out.println("not coprime");
        sc.close();

    }

    public static int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


}
