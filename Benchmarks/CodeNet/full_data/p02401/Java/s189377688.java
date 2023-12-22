import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String c = sc.next();
	char op = c.charAt(0);
	int b = sc.nextInt();
	while(op=='+'||op=='-'||op=='*'||op=='/'){
            if (op == '+') {
                System.out.println(a+b);
            } else if (op == '-') {
                System.out.println(a-b);
            } else if (op =='*'){
                System.out.println(a*b);
            }else if (op =='/'){
                System.out.println(a/b);
            }else{
                break;
            }
         a = sc.nextInt();
        c = sc.next();
         op = c.charAt(0);
        b = sc.nextInt();
        }


    }
}

