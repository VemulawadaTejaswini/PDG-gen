import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long N = S.length();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            int k = (int)S.charAt(i);
            if (map.containsKey(k)) map.put(k, map.get(k)+1);
            else map.put(k, 1);
        }
        ArrayList<Integer> val = new ArrayList<Integer>(map.values());

        long ans = 1+N*(N-1)/2;
        for (Integer v : val) ans-=(long)v*(v-1)/2;
        System.out.println(ans);
    }
}