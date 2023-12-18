import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = false;
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else{
                map.put(x, 1);
                cnt++;
            }
        }

        if(n % 3 == 0 && cnt == 3){
            int pre = -1;
            int d = 1;
            for(Entry<Integer, Integer> c : map.entrySet()){
                int tmp = c.getValue();
                if(pre < 0) pre = tmp;
                else if(pre == tmp) d++;
            }
            if(d == 3) ans = true;
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

}
