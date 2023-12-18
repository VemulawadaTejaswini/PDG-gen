import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wk_no = 0;
        int wk_priman = 0;
        String ret = "";
        // Mapの宣言
        Map<Integer, Integer> mMap = new HashMap<>();
        
        // Mapにデータを格納
        for(int i = 1 ;i <= n ; i++){
            wk_no = i;
            wk_priman = sc.nextInt();
            mMap.put( wk_priman, wk_no);    
        }
        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        
        for (Integer nKey : mMap.keySet())
        {
            ret += mMap.get(nKey).toString() + " ";
        }
        System.out.println(ret.trim());
        sc.close();
    }
}
