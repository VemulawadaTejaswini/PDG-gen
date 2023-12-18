import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ga = sc.nextInt();
        int sa = sc.nextInt();
        int ba = sc.nextInt();
        int gb = sc.nextInt();
        int sb = sc.nextInt();
        int bb = sc.nextInt();

        int[] ab = new int[N+1];
        ab[0] = 0;
        for(int i = 1; i<N+1; i++) {
            if(i-ga>=0) {
                ab[i] = ab[i - ga] + gb;
            }
            if(i-sa>=0) {
                ab[i] = Math.max(ab[i] , ab[i - sa] + sb);
            }
            if(i-ba>=0) {
                ab[i] = Math.max(ab[i] , ab[i - ba] + bb);
            }

        }

        int M = ab[N];
        long[] btoa = new long[M+1];

        for(int i = 0; i<M+1; i++) {
            if(i-gb>=0) {
                btoa[i] = btoa[i - gb] + ga;
            }
            if(i-sb>=0) {
                btoa[i] = Math.max(btoa[i] , btoa[i - sb] + sa);
            }
            if(i-bb>=0) {
                btoa[i] = Math.max(btoa[i] , btoa[i - bb] + ba);
            }
        }
        System.out.println(btoa[M]);

    }
}