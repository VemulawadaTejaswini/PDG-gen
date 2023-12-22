import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();

        Scanner scan = new Scanner(System.in);
        while (true) {
            String instruction = scan.next();
            String block;

            switch (instruction) {
            case "quit":
                return;

            case "push":
                block = scan.next();
                stack.push(block);
                break;

            case "pop":
                block = stack.pop();
                System.out.println(block);
                break;
            }
        }
    }
}