import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        boolean[] ok = new boolean[n];
        int ans = 0;
        Arrays.fill(ok,true);

        for(int i = 1;i <= n;i++){
            map.put(i,sc.nextInt());
        }

        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(map.get(a) < map.get(b)){
                ok[a-1] = false;
            }
            if(b == n && map.get(a) >= map.get(b)){
                ok[n-1] = false;
            }
                
        }

        for(int i = 0;i < n;i++){
            if(ok[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}