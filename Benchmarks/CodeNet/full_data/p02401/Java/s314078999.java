import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        do{
            int res = 0;
            int a = input.nextInt();
            String op = input.next();
            int b = input.nextInt();
            res = calculate(a, op, b);
            if(op.compareTo("?") != 0)
                System.out.println(res);
            else
                break;
        }while(input.hasNext());
    }
    public static int calculate(int a, String op, int b){
        int result = 0;
        switch(op){
            case "+" :
                result = a + b;
                break;
            case "-" :
                result = a - b;
                break;
            case "/" :
                result = a / b;
                break;
            case "*" :
                result = a * b;
                break;
            default :
                break;
        }
        return result;
    }
}
