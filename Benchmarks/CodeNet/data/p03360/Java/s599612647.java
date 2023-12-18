import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        
        int multiplier = scan.nextInt();
        
        int max = 0;
        
        if(number2 > number1 && number2 > number3){
            max = number2;
            number2 = 0;
        }else if(number3 > number2 && number3 > number1){
            max = number3;
            number3 = 0;
        }else if(number1 > number2 && number1 > number3){
            max = number1;
            number1 = 0;
        }
        
        for (int count = 0 ; count < multiplier ; count++){
            max = max * 2;
        }
        
        int ans = number1 + number2 + number3 + max;
 
        System.out.println(ans);
        
    }
}