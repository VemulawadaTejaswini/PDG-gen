import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        
        for(int i = 1; i < 10000; i++) {
            
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            //????????¢??°????????????
            if(op.equals("?")) {
                break;                
            }else if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                Calculator(a,op,b);
            }else {
                break;
            }
            
        }
    }
    
    public static void Calculator(int a, String op, int b) {
        if(calcJudge(a,op,b)) {
            if(op.equals("+")) {
                System.out.println(a + b);
            }else if(op.equals("-")) {
                System.out.println(a - b);
            }else if(op.equals("*")) {
                System.out.println(a * b);
            }else if(op.equals("/") && b != 0) {
                System.out.println(a / b);
            }else if(op.equals("/") && b == 0) {
                System.out.println("0??????????????????????????\????????????");
            }else {
                System.out.println("??£??????????????\????????????????????????");
            } 
        }
    }
        
    public static boolean calcJudge(int a, String op, int b) {
        if(a < 0 || b < 0 || a > 20000 || b > 20000) {
            return false;
        }else return true;
    }
}