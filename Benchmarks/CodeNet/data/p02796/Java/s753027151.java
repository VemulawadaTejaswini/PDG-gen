import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        int[] X = new int[N];
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i=0; i<N; i++) {
            X[i] = Integer.parseInt(sc.next());
            int l = Integer.parseInt(sc.next());            
            map1.put(X[i], X[i]+l);
            map2.put(X[i], X[i]-l);
        }
        sc.close();

        Arrays.sort(X);
        for (int i=0; i<N; i++) {
            if (X[i]==0) continue;
            for (int j=i+1; j<N; j++) {
                if (X[j]==0) continue;
                if(map1.get(X[i])>map2.get(X[j])) {
                    X[j] = 0;
                }
            }
        }

        long cnt = Arrays.stream(X)
                        .filter(x -> x>0)
                        .count();
        System.out.println(cnt);
    }
}