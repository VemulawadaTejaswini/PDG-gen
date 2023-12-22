import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());
 
            ArrayList<Long> height = new ArrayList<>();
            HashSet<Integer> bad = new HashSet<>();
 
            height.add((long)0);
 
            for(int i = 0; i < n; i++){
                height.add(Long.parseLong(sc.next()));
            }
 
            for(int j = 0; j < m; j++){
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());
 
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