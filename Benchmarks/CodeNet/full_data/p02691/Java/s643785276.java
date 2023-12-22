import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int[] idxDiff = new int[n];
        for (int i=0; i<n; i++) idxDiff[i] = arr[i] - i;

        Map<Long, Long> map = new HashMap<>();

        long ans = 0;

        outer:
        for (int i=n-1; 0<=i; i--) {
            long base = (long)(idxDiff[i]);
//            System.out.println(base);
            long wantDiff = (long)(i + arr[i]) * (-1);
            if (map.containsKey(wantDiff)) {
                ans += map.get(wantDiff);
                if (map.containsKey(base)) {
                    long adds = map.get(base);
                    map.put(base, adds + 1L);
                } else {
                    map.put(base, 1L);
                }
            } else {
                if (map.containsKey(base)) {
                    long adds = map.get(base);
                    map.put(base, adds + 1L);
                } else {
                    map.put(base, 1L);
                }
            }
        }

        System.out.print(ans);
//        System.out.print(map);
//        for (int i=0; i<n; i++) System.out.println(idxDiff[i]);
//        System.out.print(map.size());

//        System.out.print(idxDiff[3]);


    }
}
