import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0;i < n;i++){
            String s = sc.next();
            map.put(s,1);
        }

        Iterator ite = map.values().iterator();
        while(ite.hasNext()){
            ans += (Integer)ite.next();
        }
        System.out.println(ans);
    }
}