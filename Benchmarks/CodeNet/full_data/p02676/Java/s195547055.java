import java.util.*;

public class Main {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Integer k = scan.nextInt();
    String s = scan.next();

    if(s.length()<k){
        System.out.println(s);
    } else {
        System.out.println(s.substring(0,k)+"...");     
    }  

    scan.close();
    }    
}