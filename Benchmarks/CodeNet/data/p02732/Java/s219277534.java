import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        int[] a = new int[200001];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }else {
                map.put(a[i], 1);
            }
        }
        long sum = 0;
        for(int value : map.values()) {
            if(value > 1) {
                sum += combi(value);
            }
        }
        
        long ans = 0;
        for(int i=0; i<n; i++) {
            if(map.get(a[i]) == 1) {
                System.out.println(sum);
            }else if(map.get(a[i]) == 2) {
                System.out.println(sum-1);
            }else {
                System.out.println(sum - combi(map.get(a[i])) + combi(map.get(a[i])-1));
            }
        }
        
    }
    //組み合わせ
    public static long combi(int a) {
        return a*(a-1) / 2;
    }

}