import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int goodTenbo = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] tenbo = new int[N];
        for (int i = 0; i < N; i++) {
            tenbo[i] = sc.nextInt();
        }
        sc.nextLine();

        Set<Set<Integer>> michi = new HashSet<Set<Integer>>();
        for (int i = 0; i < M; i++) {
            Set<Integer> tmp = new HashSet<Integer>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            tmp.add(a);
            tmp.add(b);
            michi.add(tmp);
        }

        for (int i = 1; i <= N; i++) {
            int tenbocheck = 0;
            for (Set<Integer> m : michi) {
                Set<Integer> tmp = new HashSet<Integer>(m);
                if (tmp.contains(i)) {
                    tmp.remove(i);
                    int x = tmp.iterator().next();
                    if (tenbo[i-1] <= tenbo[x-1]){
                        tenbocheck++;
                    }
                }
            }
            if (tenbocheck == 0) {
                goodTenbo++;
            }
        }

        System.out.println(goodTenbo);
    }
}