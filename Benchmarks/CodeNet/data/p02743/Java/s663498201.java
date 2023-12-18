import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        
        //int num[] = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        
        if(Math.sqrt(a) + Math.sqrt(b) > a && Math.sqrt(a) + Math.sqrt(b) > b){
            if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            if(Math.sqrt(a / 10000000) + Math.sqrt(b / 10000000) < Math.sqrt(c / 10000000)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
        //int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        
        
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
 
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}