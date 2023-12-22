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

        List<Integer> l = new ArrayList<>();

        int n = 1;
        int loop = 0;
        while(true) {
            if(!l.contains(n)) {
                l.add(n);
                n = A[n-1];
            } else {
                loop = l.indexOf(n);
                break;
            }
        }

        int ans = 0;
        if(loop > K) {
            System.out.println(l.get(loop));
            System.exit(0);
        } else {
            ans = (int) ((K - loop) % (l.size() - loop));
        }

        System.out.println(A[ans+loop]);
        sc.close();
    }
}