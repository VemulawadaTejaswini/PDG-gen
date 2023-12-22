import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        String op = scan.nextInt();
        int b = scan.nextInt();
        int x;
        for(int i = 0; i <- 20000; i++){
            if(op == "+"){
                x = a + b;
            }else if(op == "-"){
                x = a - b;
            }else if(op == "*"){
                x = a * b;
            }else if(op == "/"){
                x = a / b;
            }else if(op == "?"){
                break;
            }
            System.out.println(x);
        }
    }
}