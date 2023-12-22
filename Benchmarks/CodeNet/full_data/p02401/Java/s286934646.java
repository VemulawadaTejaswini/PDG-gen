import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;



interface Command {
    int runCommand(int a, int b);
}

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Map<Character, Command> methodMap = new HashMap<Character, Command>();

        methodMap.put('+', new Command() {
            public int runCommand(int a, int b) { return a + b; };
        });
        methodMap.put('-', new Command() {
            public int runCommand(int a, int b) { return a - b; };
        });
        methodMap.put('/', new Command() {
            public int runCommand(int a, int b) { return a / b; };
        });
        methodMap.put('*', new Command() {
            public int runCommand(int a, int b) { return a * b; };
        });

        while(true) {
            int one = input.nextInt();
            char op = input.next().charAt(0);
            if(op =='?') break;
            int two = input.nextInt();
            int result = methodMap.get(op).runCommand(one,two);
            System.out.println(result);
        }
    }
}
