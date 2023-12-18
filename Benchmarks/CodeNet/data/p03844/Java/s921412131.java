import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        // TODO code application logic here
        QuestionB a = new QuestionB();
        a.print();                
    }

public class QuestionA {

    private static int a;
    private static int b;
    String op;
    Scanner sc = new Scanner(System.in);

    public QuestionA() {
        this.a = sc.nextInt();
        this.op = sc.next();
        this.b = sc.nextInt();
    }
    
    public void print(){
        int c = 0;
        switch(op){
            case "+": c = a + b; break;
            case "-": c = a - b; break;
            case "*": c = a * b; break;
            case "/": c = a / b; break;                
        }
        System.out.println(c);
    }
}
}
