
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        main.solve(in,out);

        in.closeReader();
        out.close();

    }

    //-----------Main to the problem--------------------------
    public void solve(InputReader reader,PrintWriter outputWriter) {
        int n = reader.nextInt();
        int[] inputArray = new int[n];
        int maxGcd = -99999;

        for (int i = 0; i < n; i++) {
            inputArray[i] = reader.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    stack.add(inputArray[j]);
                }
            }
            while (stack.size() > 1) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int gcd = gcd(op1, op2);
                stack.push(gcd);
            }
            int gcd = stack.pop();
            if(gcd > maxGcd){
                maxGcd = gcd;
            }
        }

        outputWriter.println(maxGcd);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}



//-----------InputReader class for faster input----------
class InputReader {

    BufferedReader bufferedReader;
    StringTokenizer stringTokenizer;

    public InputReader() {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Splits the Input line by whitespace and returns one word at a time
     * @return next word in the sequence
     */
    public String next() {
        //If current Tokens have been exhausted, or isn't initialized - fetch new line and tokenize it.
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
            try {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }

    public int nextInt() {

        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine(){
        String str = "";
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Useful for debugging, it prints to std out in formatted way :- source : message
     * @param source  The origin of the message
     * @param message Description of message
     */
    public static void log(String source,String message){
        System.out.println(source + ":" + message);
    }

    public void closeReader(){
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


