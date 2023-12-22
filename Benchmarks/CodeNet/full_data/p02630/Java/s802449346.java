import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] arr = new int[N];
        Map<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            sum += arr[i];
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(map.containsKey(b)) {
                int count = map.get(b);
                sum -= b * count;
                sum += c * count;
                map.remove(b);
                map.put(c, map.getOrDefault(c, 0) + count);
            }
            System.out.println(sum);
        }
    }
}