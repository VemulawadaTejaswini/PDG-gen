import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                int insert = Integer.parseInt(sc.next());
                int count = Integer.parseInt(sc.next());
                for(int j = 0; j < count; j++){
                    list.add(insert);
                }
            }

            Collections.sort(list);
            System.out.println(list.get(k - 1));
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}