import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        int[] y = new int[m];
        Map<Integer, Integer> ymap = new HashMap<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<m; i++) {
            p[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            ymap.put(y[i], p[i]);
            map.put(y[i], i);
        }

        int[] simo = new int[m];
        //Map<Integer, Integer> pmap = new HashMap<>();
        int[] parr = new int[n];
        for(int key : map.keySet()) {
            int pre = ymap.get(key);
            parr[pre-1]++;
            //if(pmap.containsKey(pre)) {
                //pmap.put(pre, pmap.get(pre)+1);
            //}else {
                //pmap.put(pre, 1);
            //}
            simo[map.get(key)] = parr[pre-1];//pmap.get(pre);
        }
        
        for(int i=0; i<m; i++) {
            String s =String.format("%06d", p[i])+String.format("%06d", simo[i]);
            System.out.println(s);
        }
    }
}