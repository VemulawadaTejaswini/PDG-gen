import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[m];
        Map<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        long sum = 0;
        //aを格納
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
        }
        Arrays.sort(a);
        //key=c[i] value=b[i]の合計としてTreeMap
        for(int i=0; i<m; i++) {
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            if(map.containsKey(c[i])) map.put(c[i], map.get(c[i])+b[i]);
            else map.put(c[i], b[i]);
        }
        
        for(int key : map.keySet()) {
            int count = map.get(key);
            if(a[0] < key) {
                for(int j=0; j<n; j++) {
                    if(count == 0) break;
                    if(a[j] < key) {
                        sum -= a[j];
                        a[j] = key;
                        sum += key;
                        count--;
                    }else break;
                }
                Arrays.sort(a);
            }else break;
        }

        System.out.println(sum);
    }
}