import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int top = 0;
    static int[] S = new int[1000];
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(br.readLine());
        String[] inputChar = br.readLine().split(" ");

        String s;
        int a, b;
        for (int i = 0; i < inputChar.length; i++) {
            s = inputChar[i];
            switch (s){
                case "+":
                    a = pop();
                    b = pop();
                    push(a + b);
                    break;

                case "-":
                    a = pop();
                    b = pop();
                    push(b-a);
                    break;

                case "*":
                    a = pop();
                    b = pop();
                    push(a * b);
                    break;

                default:
                    push(Integer.parseInt(s));
            }
        }

        System.out.println(pop());

    }

    static void push(int x) {
        top++;
        S[top] = x;
    }

    static int pop() {
        top--;
        return S[top + 1];
    }
}

