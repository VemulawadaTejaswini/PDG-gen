import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer result = null;
 
        while(sc.hasNextLine()){
            int a = sc.nextInt();
            String o = sc.next();
            int b = sc.nextInt();
 
            if(a == 0 && b == 0){
                break;
            }else if(o.equals("?")){
            	break;
            }else if(o.equals("+")){
            	result = a + b;
            }else if(o.equals("-")){
            	result = a - b;
            }else if(o.equals("*")){
            	result = a * b;
            }else if(o.equals("/") && a%b == 0){
            	result = a / b;
            }else if(o.equals("/") && a%b != 0){
            	result = a % b;
            }
        }
        if(result != null){
        	System.out.println(result);
        }
    }
}