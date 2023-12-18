import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            String a = sc.next();
            
            // aを辞書順にソート
            a = lexicalOrderSort(a);
            
            if ( map.containsKey(a) ){
                Integer b = map.get(a);
                map.put(a, ++b);
            } else {
                map.put(a, 1);
            }
        }
        
        long sum = 0;
        for(Integer mapValue : map.values() ){
            sum += (long) mapValue * (mapValue - 1) / 2;
        }
        
        System.out.println(sum);
    }
    
    public static String lexicalOrderSort(String s){
        
        int[] schar = new int[10];
        for(int i = 0; i < 10; i++){
            int a = s.charAt(i);
            schar[i] = a;
        }
        
        Arrays.sort(schar);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 10; i++){
            char a = (char) (schar[i]);
            sb.append(a);
        }
        
        return sb.toString();
        
    }
}
