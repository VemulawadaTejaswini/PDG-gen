import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        sc.close();
        int max = 0;
        for(int i  = 1; i < N; i++){
            String X = S.substring(0, i);
            String Y = S.substring(i);
            Map<String, Integer>map = new HashMap<>();
            for(int j = 0; j < X.length(); j++){
                map.put(String.valueOf(X.charAt(j)), 1);
            }
            for(int j = 0; j < Y.length(); j++){
                if(map.containsKey(String.valueOf(Y.charAt(j)))){
                    map.put(String.valueOf(Y.charAt(j)), 2);
                }
            }
            int count = 0;
            for(String key: map.keySet()){
                if(map.get(key) == 2)
                    count++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}