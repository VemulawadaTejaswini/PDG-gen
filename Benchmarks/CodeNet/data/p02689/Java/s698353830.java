import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
 
            ArrayList<Integer> height = new ArrayList<>();
            ArrayList<Integer> bad = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>(new HashSet<>(bad));
 
            height.add(0);
 
            for(int i = 0; i < n; i++){
                height.add(Integer.parseInt(sc.next()));
            }
 
            for(int j = 0; j < m; j++){
                int a = Integer.parseInt(sc.next());
                int b = Integer.parseInt(sc.next());
 
                if(height.get(a) > height.get(b)) ans.add(b);
                else if(height.get(a) == height.get(b)){
                    ans.add(a);
                    ans.add(b);
                }else ans.add(a);
            }
            
            System.out.println(n - ans.size());
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}