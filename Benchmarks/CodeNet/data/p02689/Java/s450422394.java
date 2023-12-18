import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
 
            ArrayList<Integer> height = new ArrayList<>();
            HashSet bad = new HashSet();
 
            height.add(0);
 
            for(int i = 0; i < n; i++){
                height.add(Integer.parseInt(sc.next()));
            }
 
            for(int j = 0; j < m; j++){
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());
 
                if(height.get(a) > height.get(b)) bad.add(b);
                else if(height.get(a) == height.get(b)){
                    bad.add(a);
                    bad.add(b);
                }else bad.add(a);
            }
 
            System.out.println(n - bad.size());
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}