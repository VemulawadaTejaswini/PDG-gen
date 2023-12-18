
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int l= sc.nextInt();
            map.put(x+l,x-l);
        }

        Set<Integer> key =map.keySet();
        List<Integer> list = new ArrayList<>(key);
        list.sort(Integer::compareTo);

        int ans = 0;
        int now = Integer.MIN_VALUE;
        for(Integer i : list){
            if(map.get(i)>=now){
                ans++;
                now = i;
            }
        }

       System.out.println(ans);



    }
}
