import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        List<Long> res = new ArrayList<>();
        List<Long> p = new ArrayList<>();
        List<Long> q = new ArrayList<>();
        List<Long> r = new ArrayList<>();
        for(int i=0;i<A;i++){
            p.add(sc.nextLong());
        }
        for(int i=0;i<B;i++){
            q.add(sc.nextLong());
        }
        for(int i=0;i<C;i++){
            r.add(sc.nextLong());
        }
        Collections.sort(p, Comparator.reverseOrder());
        Collections.sort(q, Comparator.reverseOrder());
        Collections.sort(r, Comparator.reverseOrder());
        res.addAll(p.subList(0,X));
        res.addAll(q.subList(0,Y));
        res.addAll(r);
        Collections.sort(res, Comparator.reverseOrder());
        long sum=0;
        for(int i=0;i<X+Y;i++){
            sum += res.get(i);
        }

        System.out.println(sum);

    }

    private static class Ringo{
        int rg;
        long value;
        Ringo(int rg, long value){
            this.rg = rg;
            this.value = value;
        }
    }
}
