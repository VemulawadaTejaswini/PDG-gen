import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    static int min = Integer.MAX_VALUE;
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
        for (int i = 0;i < n - 1;++i){
            fs.get(i).sync();
        }
        fs.sort((c,d) -> {return d.size - c.size;});
        int co = 0;
        while (fs.get(0).connects.size() > 0){
            F f = fs.get(0);
            for (int j:f.connects.keySet()){
                for (int k = 1;k < n - 1;++k){
                    if(fs.get(k).size > 0&&fs.get(k).connects.containsKey(j)&&fs.get(k).connects.get(j)){
                        fs.get(k).connects.put(j,false);
                        --fs.get(k).size;
                    }
                }
            }
            ++co;
            f.connects.clear();
            f.size = 0;
            fs.sort((c,d) -> {return d.size - c.size;});
        }

        System.out.println(co);
    }



    static class F{
        HashMap<Integer,Boolean> connects = new HashMap<>();
        int size = 0;
        public void sync(){
            size = connects.size();
        }
    }
}
