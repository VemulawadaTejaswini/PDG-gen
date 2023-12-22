public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            if(n == 0 && p == 0) break;
            int[] a = new int[n];
            int b = p;
            int k = 0;
            int ans;
            while(true) {
                if(b > 0) {
                    a[k]++;
                    b--;
                } else {
                    b += a[k];
                    a[k] = 0:
                }
                if(a[k] == p) {
                    ans = k;
                    break;
                }
                k = (k+1) % n;
            }
            System.out.println(ans);
        }
    }
}

