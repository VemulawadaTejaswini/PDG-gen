import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.next();
            String t = sc.next();

            int diff = 0;

            for(int i = 0; i < s.length(); i++){
                String subStrS = s.substring(i, i + 1);
                String subStrT = t.substring(i, i + 1);

                if(!subStrS.equals(subStrT)) diff++;
            }

            System.out.println(diff);


        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}