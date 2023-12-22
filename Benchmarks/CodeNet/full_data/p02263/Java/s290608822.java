import java.io.*;

public class Main {

    public static void main(String a[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int[]  stack = new int[input.length];
        int top = -1;
        int op1, op2;
        for (String i : input) {
            switch (i) {
                case "-":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 - op1 ;
                    break;
                case "+":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 + op1;
                    break;
                case "/":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 / op1;
                    break;
                case "*":
                    op1 = stack[top];
                    stack[top--] = 0;
                    op2 = stack[top];
                    stack[top--] = 0;
                    stack[++top] = op2 * op1;
                    break;
                default:
                    stack[++top] = Integer.parseInt(i);
                    break;
            }
        }
        bw.append(stack[0] + "\n");
        bw.flush();
    }

}
