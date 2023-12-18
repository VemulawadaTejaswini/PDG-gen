import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("");
        String a = sc.next();
        String b = sc.next();
        try{
            String c = sc.next(); 
            System.out.println(c+b+a);
        }catch(NoSuchElementException e){
            System.out.println(a+b);
        } 
    }
}