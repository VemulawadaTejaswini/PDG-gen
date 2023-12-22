import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        if(Character.isUpperCase( A.charAt( 0 ))){
         System.out.println("A");   
        }else{
            System.out.println("a");
        }
        
    }    
}
