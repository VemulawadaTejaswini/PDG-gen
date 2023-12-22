import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,answer;
        String op;
        boolean continueWhile = true;
        while(continueWhile){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            switch(op){
                case "+":
                    answer = a+b;
                    System.out.println(answer);
                    break;
                case "-":
                    answer = a-b;
                    System.out.println(answer);
                    break;
                case "*":
                    answer = a*b;
                    System.out.println(answer);
                    break;
                case "/":
                    answer = a/b;
                    System.out.println(answer);
                    break;
                case "?":
                    continueWhile = false;
                    break;
            }

            
        }

        sc.close();
    }
}
