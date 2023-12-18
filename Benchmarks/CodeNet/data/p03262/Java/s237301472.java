import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] nums=new int[n];
        int ans=Math.abs(sc.nextInt()-x);
        for(int i=1;i<n;i++){
            ans=Euclid(ans,Math.abs(sc.nextInt()-x));
        }
        System.out.println(ans);

    }
        private static int Euclid(int n, int m) {
        int tmp;
        while (true) {
            if (n == 0) {
                return m;
            } else if (m == 0) {
                return n;
            }
            tmp = n;
            n = m;
            m = tmp;
            n = n % m;

        }

    }
}
