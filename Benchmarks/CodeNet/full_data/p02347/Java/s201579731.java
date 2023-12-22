import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args){
        Map<Pair,List<Pair>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int x = sc.nextInt(),y = sc.nextInt();
            List<Pair> list = map.computeIfAbsent(Pair.valueOf(-1,x / 10000,y / 10000),key->new ArrayList<>());
            list.add(Pair.valueOf(list.size(),x,y));
        }
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int x1 = sc.nextInt(),x2 = sc.nextInt(),y1 = sc.nextInt(),y2 = sc.nextInt();
            int _x1 = x1 / 10000,_x2 = x2 / 10000,_y1 = y1 / 10000,_y2 = y2 / 10000;
            Pair.valueOf(-1,_x1,_y1).compute(Pair.valueOf(-1,_x2,_y2),
                    p->{
                        List<Pair> list = map.get(p);
                        if(list != null){
                            list.forEach(_p->{
                                int x = _p.getKey(),y = _p.getValue();
                                if(x1 <= x && x <= x2 && y1 <= y && y <= y2) System.out.println(_p.getId());
                            });
                        }
                    });
            System.out.println();
        }
        sc.close();
    }

}

class Pair{
    private static final Map<String,Pair> map = new HashMap<>();

    public static Pair valueOf(int id,int k,int v){
        return map.computeIfAbsent(k + ":" + v,key->new Pair(id,k,v));
    }

    private int id;
    private int key;
    private int value;

    private Pair(int id,int key,int value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public int getId(){
        return id;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void compute(Pair p, Consumer<Pair> f){
        if(key <= p.key && value <= p.value){
            for(int i = key,l = p.key;i <= l;i++){
                for(int j = value,m = p.value;j <= m;j++) f.accept(new Pair(-1,i,j));
            }
        }
    }

    @Override
    public String toString() {
        return id + ":(" + key + "," + value + ")";
    }

    @Override
    public int hashCode() {
        return key * 13 + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Pair) {
            Pair pair = (Pair) o;
            if (key != pair.key || value != pair.value) return false;
            return true;
        }
        return false;
    }
}