import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        //HashMap<Integer, Hashmap<Integer, Integer>> map = new HashMap<Integer, Hashmap<Integer, Integer>>();
        //Map<Integer, Map<Integer,Integer>> map = new HashMap<Integer, Map<Integer,Integer>>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int a, b, max = 0;
        String key, max_key = "";
        //for文
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            for(int j = 0; j < i; j++){
                a = x[i] - x[j];
                b = y[i] - y[j];
                if(a < 0 && b < 0){
                    a = Math.abs(a);
                    b = Math.abs(b);
                }else if(a < 0 && b > 0){
                    a = Math.abs(a);
                    b = Math.abs(b);
                }
                key = a + " " + b;
                if(map.get(key) == null) map.put(key, 1);
                else map.put(key, map.get(key) + 1);
                if(map.get(key) > max){
                    max = map.get(key);
                    max_key = key;
                }
            }
        }

        int ans;
        if(map.get(max_key) == null) ans = 0;
        else ans = map.get(max_key);

        // 出力
        System.out.println(n - ans);

    }

}