
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Together.together(args);
                
    }
    
}


/**
 *
 * @author bhatti
 */
class Together {
    
    public static void together(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0 ; i < N ; ++i){
            int a = sc.nextInt();
            if(m.containsKey(a)){
                m.put(a, m.get(a) + 1);
            }else{
                m.put(a, 1);
            }
        }
        
        int max = -1;
        
        for(int k : m.keySet()){
            int tmp = 0; 
            tmp += m.containsKey(k - 1) ? m.get(k - 1) : 0;
            tmp += m.get(k);
            tmp += m.containsKey(k + 1) ? m.get(k + 1) : 0;
            max = Math.max(max, tmp);
        }
        
        System.out.println(max);
    }
        
}