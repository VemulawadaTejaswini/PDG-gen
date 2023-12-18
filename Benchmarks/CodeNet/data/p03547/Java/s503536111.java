import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        if(a.equals(b)){
            System.out.print("=");
        }else if(a.compareTo(b)==-1){
            System.out.print("<");
        }else{
            System.out.print(">");
        }
   }
}
