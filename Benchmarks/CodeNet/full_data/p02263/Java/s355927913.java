import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(sc.nextLine());
        stack.printCalcResult();
    }

}

class Stack {

    String[] input = new String[199];
    int[] valStack = new int[100];

    Stack(String text) {
        input = text.split(" ");
    }

    private int calc() {
        int top = 0;
        for(String s: input) {
            switch(s) {
            case "+":
                valStack[top-2] += valStack[top-1];
                top--;
                break;
            case "-":
                valStack[top-2] -= valStack[top-1];
                top--;
                break;
            case "*":
                valStack[top-2] *= valStack[top-1];
                top--;
                break;
            default:
                valStack[top] = Integer.parseInt(s);
                top++;
                break;
            }
        }
        return valStack[0];
    }

    public void printCalcResult() {
        System.out.println(calc());
    }

}
