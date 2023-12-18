import java.util.*;

class B128{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> m = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            m.put(sc.next(),sc.nextInt());
        }

        Object[] mapkey = m.keySet().toArray();
        Arrays.sort(mapkey);

        for(String nkey : m.keySet()){
            System.out.println(m.keySet() + " " + m.get(nkey));
        }
    }
}