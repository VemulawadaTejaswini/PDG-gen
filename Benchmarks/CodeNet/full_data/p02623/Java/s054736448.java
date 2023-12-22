import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    static List<Long> a;
    static List<Long> b;

    static long dfs(int anum, int bnum, long cost, int count){
        if(anum == a.size() && bnum == b.size()){
            return count;
        }
        long tempa = 0;
        if(a.size() > anum && cost >= a.get(anum)){
            tempa = dfs(anum + 1, bnum, cost - a.get(anum), count + 1);
        }
        long tempb = 0;
        if(b.size() > bnum && cost >= b.get(bnum)){
            tempb = dfs(anum, bnum + 1, cost - b.get(bnum), count + 1);
        }
        if(tempa == 0 && tempb == 0){
            return count;
        }
        else{
            return tempa > tempb ? tempa : tempb;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());

        a = new ArrayList<>();
        b = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(Long.parseLong(sc.next()));
        }
        for(int i=0; i<m; i++){
            b.add(Long.parseLong(sc.next()));
        }

        System.out.println(dfs(0, 0, k, 0));
    }
}