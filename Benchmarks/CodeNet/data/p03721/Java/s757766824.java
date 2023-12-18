import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Long, Long> map = new TreeMap<>();
        long[][] a = new long[2][N];
        for(int i = 0; i < N; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            if(map.containsKey(a[0][i]))
                map.put(a[0][i], map.get(a[0][i]) + a[1][i]);
            else
                map.put(a[0][i], a[1][i]);
        }
        sc.close();
        
        long sum = 0;
        for(Long key: map.keySet()){
            sum += map.get(key);
            if(sum >= K){
                System.out.println(key);
                return;
            }
        }
    }
}