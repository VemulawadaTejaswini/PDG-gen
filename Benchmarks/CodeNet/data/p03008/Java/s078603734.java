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
        if(N>1) ab[1] = 1;
        for(int i = 1; i<N+1; i++) {
            //ab[i] = ab[i-1]+1;
            if(i-ga>=0) {
                ab[i] = Math.max(ab[i], ab[i - ga] + gb);
            }
            if(i-sa>=0) {
                ab[i] = Math.max(ab[i] , ab[i - sa] + sb);
            }
            if(i-ba>=0) {
                ab[i] = Math.max(ab[i] , ab[i - ba] + bb);
            }

        }

//        for(long l: ab){
//            System.out.print(l + " ");
//        }
//        System.out.println();

        int M = ab[N];
        //System.out.println(M);
        long[] btoa = new long[M+1];
        if(M>1) btoa[1] = 1;
        for(int i = 1; i<M+1; i++) {
            //btoa[i] = btoa[i-1]+1;
            if(i-gb>=0) {
                btoa[i] = Math.max(btoa[i], btoa[i - gb] + ga);
            }
            if(i-sb>=0) {
                btoa[i] = Math.max(btoa[i] , btoa[i - sb] + sa);
            }
            if(i-bb>=0) {
                btoa[i] = Math.max(btoa[i] , btoa[i - bb] + ba);
            }
        }
//        for(long l: btoa){
//            System.out.print(l + " ");
//        }
//        System.out.println();
        System.out.println(btoa[M]);

    }
}