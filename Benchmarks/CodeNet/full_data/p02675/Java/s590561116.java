import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();
        
        if(str.charAt(a-1) == '3'){
            System.out.println("bon");
        }else if(str.charAt(a-1) == '0' || str.charAt(a-1) == '1' || 
        str.charAt(a-1) == '6' || str.charAt(a-1) == '8'){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}