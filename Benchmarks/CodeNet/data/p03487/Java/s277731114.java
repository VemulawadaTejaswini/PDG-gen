import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        long ans = 0;

        Arrays.sort(a);

        Map<Long, Long> map = new HashMap<>();

        for (int i=0; i<n; i++){
            if (map.containsKey(a[i])){
                long c = map.get(a[i]);
                map.put(a[i], ++c);
            }else {
                map.put(a[i], 1l);
            }
        }

        for (Long key: map.keySet()){
            if (key!=map.get(key)){
                if (key<map.get(key)){
                    ans += (map.get(key)-key);
                }else if (key>map.get(key)){
                    ans += map.get(key);
                }
            }
        }

        for (Long key: map.keySet()){
            if (key!=map.get(key) && key<map.get(key)){
                    ans += (map.get(key)-key);
                } else if (key!=map.get(key) && key>map.get(key)){
                    ans += map.get(key);
                }else if (key!=map.get(key) && key==map.get(key)){
                return;
            }
            }


//        System.out.println(map);
        System.out.println(ans);

    }
}
