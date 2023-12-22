import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String op = "";
            if (op == "?")break;
            if (op == "+"){
            	System.out.println(a + b);
            }
            else if(op == "-"){
            	System.out.println(a - b);
            }
            else if(op == "*"){
            	System.out.println(a * b);
            }
            else if(op == "/" && b != 0){
            	System.out.println(a / b);
            }
        }
       
}

}
