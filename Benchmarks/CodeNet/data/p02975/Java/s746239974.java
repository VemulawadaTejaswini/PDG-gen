import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        if(map.size() >= 4){
            System.out.println("No");
        }else if(map.size() == 3){
            int xor = 0;
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                int k = e.getKey();
                int v = e.getValue();
                if(n % 3 == 0 && v == n / 3){
                    xor = xor^k;
                }else{
                    System.out.println("No");
                    return;
                }
            }
            System.out.println(xor == 0 ? "Yes" : "No");
        }else if(map.size() == 2){
            System.out.println(map.containsKey(0) && n % 3 == 0 && map.get(0) == n/3 ? "Yes" : "No");
        }else if(map.size() == 1){
            System.out.println(map.containsKey(0) ? "Yes" : "No");
        }
    }
}
