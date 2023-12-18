import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        ArrayList<F> fs = new ArrayList<>();
        for (int i = 0;i < n - 1;++i){
            fs.add(new F());
        }
        for (int i = 0;i < m;++i){
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 2;
            for (int j = a[i];j <= b[i];++j){
                fs.get(j).connects.put(i,true);
            }
        }
        fs.sort((c,d) -> {return d.connects.size() - c.connects.size();});
        int c = 0;
        for (int i = 0;i < n - 1;++i){
            F f = fs.get(i);
            if(f.connects.size() == 0)continue;
            for (int j:f.connects.keySet()){
                for (int k = 0;k < n - 1;++k){
                    if(k == i)continue;
                    if(fs.get(k).connects.containsKey(j)) {
                        fs.get(k).connects.remove(j);
                    }
                }
            }
            ++c;
            f.connects.clear();
        }

        System.out.println(c);
    }

    static class F{
        HashMap<Integer,Boolean> connects = new HashMap<>();
    }
}
