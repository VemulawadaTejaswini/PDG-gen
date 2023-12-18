import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Long[] aa = new Long[a];
        Long[] ba = new Long[b];
        Long[] ca = new Long[c];

        for(int i = 0; i<a; i++) {
            aa[i] = sc.nextLong();
        }
        for(int i = 0; i<b; i++) {
            ba[i] = sc.nextLong();
        }
        for(int i = 0; i<c; i++) {
            ca[i] = sc.nextLong();
        }

        Arrays.sort(aa,Collections.reverseOrder());
        Arrays.sort(ba,Collections.reverseOrder());
        Arrays.sort(ca,Collections.reverseOrder());

        long[] ansa = new long[x+y];
        for(int i = 0; i<x+y; i++) {
            if(i<x) ansa[i] = aa[i];
            else ansa[i] = ba[i-x];
        }

        Arrays.sort(ansa);

        long ans = 0;
        for(int i = 0; i<ansa.length; i++) {
            if(i<ca.length && ansa[i]<ca[i]) ansa[i]=ca[i];
            ans += ansa[i];
        }
        p(ans);



    }

    public static <T> void p(T message) {
        System.out.println(message);
    }

}