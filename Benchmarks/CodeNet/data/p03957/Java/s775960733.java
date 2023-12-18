import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String code = sc.nextLine();
       boolean result = false;
       for(int i=0; i< code.length(); i++){
           if(code.charAt(i) == 'c' || code.charAt(i) == 'C'){
               result = true; 
           }
           
           if((code.charAt(i) == 'f' || code.charAt(i) == 'F') && result){
               System.out.println("Yes");
               break;
           }
           if(i == code.length()-1){
                System.out.println("No");
           }
       }
       
    }
}
