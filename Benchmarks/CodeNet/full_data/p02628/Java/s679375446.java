import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int typeFruit = Integer.parseInt(sc.next());
            int buy = Integer.parseInt(sc.next());

            List<Integer> fruit = new ArrayList<>();

            for(int i = 0; i < typeFruit; i++){
                fruit.add(Integer.parseInt(sc.next()));
            }

            Collections.sort(fruit);

            long ans = 0;

            for(int i = 0; i < buy; i++){
                ans += fruit.get(i);
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}