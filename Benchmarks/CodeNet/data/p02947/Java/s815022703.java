import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            String a = sc.next();
            
            int b = 0;
            for(int j = 0; j < 10; j++){
                int c = a.charAt(j) - 'a';
                b += 1 << c;
            }
            
            if ( map.containsKey(b) ){
                Integer d = map.get(b);
                map.put(b, ++d);
            } else {
                map.put(b, 1);
            }
        }
        
        long sum = 0;
        for(Integer mapValue : map.values() ){
            sum += mapValue * (mapValue - 1) / 2;
        }
        
        System.out.println(sum);
    }
}
