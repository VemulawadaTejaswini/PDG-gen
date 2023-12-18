import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Long K = sc.nextLong();
        sc.nextLine();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Map<Integer,Integer> s = new HashMap<>();
        int count = 0;
        s.put(1, count);
        int n = A[0];
        int sa = 1;

        while(true) {
            if (s.get(n) == null) {
                s.put(n,++count);
                n = A[n-1];
            } else {
                sa = ++count - s.get(n);
                break;
            }
        }
        
        int loop = sa == count ? (int) (K % (sa)) : (int) ((K-count) % (sa));
        int ans = 1;
        if(sa != count){
            for (int i = 0; i < count; i++) {
                ans = A[ans-1];
            }
        }
        for (int i = 0; i < loop; i++) {
            ans = A[ans-1];
        }

        System.out.println(ans);
        sc.close();
    }
}