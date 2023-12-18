import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        List<Pair<Integer, Integer>> list = new ArrayList<Pair<Integer, Integer>>(); 
        
        for(int i = 0; i < n; i++){
            list.add(new Pair<Integer,Integer>(sc.nextInt(),sc.nextInt()));
        }
        
        list.sort((a,b) -> a.getKey() - b.getKey());
        
        long res = 0;
        
        for(Pair<Integer,Integer> pair : list){
            if(pair.getValue() <= m){
                m-=pair.getValue();
                res+=(long) pair.getKey() * (long) pair.getValue();
            }else{
                res+=(long) pair.getKey() * (long) m;
                break;
            }
        }
        
        System.out.println(res);
    }
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
    
    public Pair(final K key, final V value) {
        super(key, value);
    }
 }

