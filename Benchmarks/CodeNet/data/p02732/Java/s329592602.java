import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        long ans = 0;
        for(Integer key : map.keySet()){
            ans += C2(map.get(key));
        }
        for(int i = 0; i < n; i++){
            System.out.println((ans - map.get(a[i])+1));
        }
    }
    public static long C2(long n){
        return n * (n-1) / 2;
    }
}