import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        //String s = sc.next();
        
        if(n < 10){
            System.out.println(n);
        }else if(n<100){
            System.out.println(9);
        }else if(n<1000){
            System.out.println(n-90);
        }else if(n<10000){
            System.out.println(909);
        }else if(n<100000){
            System.out.println(n-9090);
        }else{
            System.out.println(90909);
        }
        
        //System.out.println(max);
    }
}