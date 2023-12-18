import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // input
        String input = scan.next();
        int a = Integer.parseInt(input.substring(0, 1));
        int b = Integer.parseInt(input.substring(1, 2));
        int c = Integer.parseInt(input.substring(2, 3));
        int d = Integer.parseInt(input.substring(3));

        // search
        loop: for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j ++){
                for(int k = 0; k < 2; k++){
                    int result = a;
                    char op1 = 0;
                    char op2 = 0;
                    char op3 = 0;
                    switch(i){
                        case 0:
                            result += b;
                            op1 = '+';
                            break;
                        case 1:
                            result -= b;
                            op1 = '-';
                    }
                    switch(j){
                        case 0:
                            result += c;
                            op2 = '+';
                            break;
                        case 1:
                            result -= c;
                            op2 = '-';
                    }
                    switch(k){
                        case 0:
                            result += d;
                            op3 = '+';
                            break;
                        case 1:
                            result -= d;
                            op3 = '-';
                    }
                    if(result == 7){
                        System.out.println(a + "" + op1+ "" + b + "" + op2 + "" + c + "" + op3 + "" + d + "=7");
                        break loop;
                    }
                }
            }
        }
    }
}