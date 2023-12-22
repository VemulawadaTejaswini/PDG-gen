import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String n = sc.next();

            String subStr = "";

            if(n.length() == 3){
                subStr = n.substring(2, 3);
            }else if(n.length() == 2){
                subStr = n.substring(1, 2);
            }else if(n.length() == 1){
                subStr = n;
            }

            
            String ans = "";

            if(subStr.equals("2") || subStr.equals("4") || subStr.equals("5") || subStr.equals("7") || subStr.equals("9")){
                ans = "hon";
            } else if(subStr.equals("0") || subStr.equals("1") || subStr.equals("6") || subStr.equals("8")){
                ans = "pon";
            } else if(subStr.equals("3")){
                ans = "bon";
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}