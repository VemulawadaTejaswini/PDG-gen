import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long[] p = new long[A];
        long[] q = new long[B];
        long[] r = new long[C];
        for(int i=0;i<A;i++){
            p[i] = sc.nextLong();
        }
        for(int i=0;i<B;i++){
            q[i] = sc.nextLong();
        }
        for(int i=0;i<C;i++){
            r[i] = sc.nextLong();
        }
        sortRev(p);
        sortRev(q);
        sortRev(r);
        int pi=0;
        int qi=0;
        int ri=0;
        LinkedList<Long> newP, newQ;
        newP = new LinkedList<>();
        newQ = new LinkedList<>();
        for(int i=0;i<X;i++){
            newP.add(p[i]);
        }
        for(int i=0;i<Y;i++){
            newQ.add(q[i]);
        }


        while(ri < C) {
            while (pi < X && newP.get(pi) >= r[ri]) {
                pi++;
            }
            while (qi < Y && newQ.get(qi) >= r[ri]) {
                qi++;
            }
            if(pi == X && qi == Y){
                break;
            }else if(pi == X){
                //q[qi] = r[ri];
                newQ.add(qi, r[ri]);
                ri++;
                continue;
            }else if(qi == B){
                //p[pi] = r[ri];
                newP.add(pi, r[ri]);
                ri++;
                continue;
            }
            if (newP.get(pi) < newQ.get(qi)) {
                newP.add(pi, r[ri]);
//                p[pi] = r[ri];
//                pi++;
            } else {
                newQ.add(qi, r[ri]);
//                q[qi] = r[ri];
//                qi++;
            }
            ri++;
        }
        long sum=0;
        for(int i=0;i<X;i++){
            sum += newP.get(i);
        }
        for(int i=0;i<Y;i++){
            sum += newQ.get(i);
        }
        System.out.println(sum);
    }
    private static void sortRev(long[] a){
        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++){
            long tmp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = tmp;
        }
    }
}
