import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=A; i<B; i++){
            map.put(i, 1);
        }
        
        int ans = 0;
        for(int i=C; i<D; i++){
            if(map.get(i) != null){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}