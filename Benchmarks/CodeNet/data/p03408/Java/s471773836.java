import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<String, Integer> NMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            if(NMap.containsKey(name)) {
                NMap.put(name, NMap.get(name) + 1);
            } else {
                NMap.put(name, 1);
            }
        }

        int M = sc.nextInt();
        Map<String, Integer> MMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if(MMap.containsKey(name)) {
                MMap.put(name, MMap.get(name) - 1);
            } else {
                MMap.put(name, -1);
            }
        }

        Map<String, Integer> RMap = new HashMap<>();
        NMap.keySet().stream().forEach(key -> {
            RMap.put(key, NMap.get(key));
        });
        MMap.keySet().stream().forEach(key -> {
            if(RMap.containsKey(key)) {
                RMap.put(key, RMap.get(key) + MMap.get(key));
            } else {
                RMap.put(key, MMap.get(key));
            }
        });
        int max = 0;
        for (String key : RMap.keySet()) {
            max = Math.max(max, RMap.get(key));
        }
        System.out.println(max);




    }

}
