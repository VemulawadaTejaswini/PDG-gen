import java.util.*;

class B128{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> m = new TreeMap<String, Integer>();

        for(int i = 0; i < n; i++){
            m.put(sc.next(),sc.nextInt());
        }

        Iterator<String> it = m.keySet().Iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(Treemap.get(key));
        }

    }
}