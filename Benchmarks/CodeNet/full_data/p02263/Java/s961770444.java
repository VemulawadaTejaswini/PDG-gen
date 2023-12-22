import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] exp = br.readLine().split(" ");
        int[] stack = new int[199];
        int top = 0;

        for (int i = 0; i < exp.length; i++) {
            if (exp[i].equals("+")) {
                stack[top - 2] += stack[top - 1];
                top--;
            } else if (exp[i].equals("-")) {
                stack[top - 2] -= stack[top - 1];
                top--;
            } else if (exp[i].equals("*")) {
                stack[top - 2] *= stack[top - 1];
                top--;
            } else {
                stack[top] = Integer.parseInt(exp[i]);
                top++;
            }
        }

        System.out.println(stack[0]);
    }
}