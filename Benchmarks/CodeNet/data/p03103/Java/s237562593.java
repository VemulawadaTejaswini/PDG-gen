import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Store[] s = new Store[n];
        for(int i = 0; i < n; i++){
            s[i] = new Store(scan.nextInt(), scan.nextInt());
        }
        Arrays.sort(s);
        long out = 0;
        int i = 0;
        for(i = 0; m > 0; i++){
            for(int j = 0; j < s[i].count && m > 0; j++){
                m--;
                out += s[i].price;
            }
        }
        System.out.println(out);
    }

    public class Store implements Comparable<Store>{
        int price, count;
        public Store(int price, int count){
            this.price = price;
            this.count = count;
        }

        @Override
        public int compareTo(Store s) {
            if(this.price == s.price) return Integer.compare(s.count, this.count);
            return Integer.compare(this.price, s.price);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
