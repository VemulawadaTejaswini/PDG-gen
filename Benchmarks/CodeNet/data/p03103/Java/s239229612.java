import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        int A[] = new int[N];
        int B[] = new int[N];
        List<Store> ls = new ArrayList<>();
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            Store s = new Store(A[i], B[i]);
            ls.add(s);
        }
        Collections.sort(ls);
        long r=0;
        for(Store s : ls) {
//            System.out.println(String.format("%d:%d", s.price, s.stock));
            if(M>s.stock) {
                r+=s.stock*s.price;
                M-=s.stock;
                continue;
            }
            r+=M*s.price;
            break;
        }
        System.out.println(r);
   }
   static class Store implements Comparable {
        int price;
        int stock;
        Store(int p, int s) {
            this.price = p;
            this.stock = s;
        }

       @Override
       public int compareTo(Object o) {
            Store t = (Store)o;
           return this.price - t.price;
       }
   }
}