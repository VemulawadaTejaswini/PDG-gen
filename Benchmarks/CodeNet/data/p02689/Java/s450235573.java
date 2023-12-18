import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());
 
            HashMap<Long, Long> height = new HashMap<>();
            HashSet<Long> bad = new HashSet<>();
 
            for(int i = 1; i < n + 1; i++){
                height.set((Long)i, (Long)Long.parseLong(sc.next()));
            }
 
            for(int j = 0; j < m; j++){
                long a = Long.parseLong(sc.next());
                long b = Long.parseLong(sc.next());

                if(height.get(a) > height.get(b)) {
                    if(bad.add(b)) n--;
                }else if(height.get(a) == height.get(b)){
                    if(bad.add(a)) n--;
                    if(bad.add(b)) n--;
                }else {
                    if(bad.add(a)) n--;
                }
            }
 
            System.out.println(n);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}