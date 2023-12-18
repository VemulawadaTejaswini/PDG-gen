import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        HashMap<Integer,Integer> mapL = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapR = new HashMap<Integer,Integer>();
        mapL.put(first,1);
        mapR.put(-first,1);
        int zero = 0;
        long ans = 0;
        for(int i = 1; i < n; i++){
            int v = sc.nextInt();
            if(v == 0) zero++;
            int L = i+v;
            int R = i-v;
            if(mapL.containsKey(L)){
                mapL.put(L,mapL.get(L)+1);
            }else{
                mapL.put(L,1);
            }
            if(mapR.containsKey(R)){
                mapR.put(R,mapR.get(R)+1);
            }else{
                mapR.put(R,1);
            }
        }
        for(Map.Entry<Integer,Integer> e : mapL.entrySet()){
            if(mapR.containsKey(e.getKey())){
                ans += (e.getValue()*mapR.get(e.getKey()));
            }
        }
        System.out.println(Math.max(0,ans-zero));
    }
}

