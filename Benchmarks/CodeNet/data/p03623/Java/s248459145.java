import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        int disA = 0;
        int disB = 0;
        
        if(x - a >= 0){
            disA = x - a;
        }else{
            disA = a - x;
        }
        
        if(x - b >= 0){
            disB = x - b;
        }else{
            disB = b - x;
        }
        
        if(disA < disB){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}