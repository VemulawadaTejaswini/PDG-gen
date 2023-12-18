import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String aaa = sc.next();
        
        aaa.replaceAll("0","");
        
        System.out.println(aaa.length());
    }
       
}