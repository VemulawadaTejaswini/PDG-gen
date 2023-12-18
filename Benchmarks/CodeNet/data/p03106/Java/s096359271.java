

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    int op1,op2;

    public static void main(String[] args) throws IOException {
        abc120_b solution = new abc120_b();
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        solution.solve(in,out);

        in.closeReader();
        out.close();

    }

    //-----------Main to the problem--------------------------
    public void solve(InputReader reader, PrintWriter outputWriter) {
        op1 = reader.nextInt();
        op2 = reader.nextInt();
        int k = reader.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (op1 > op2) {
            int temp = op1;
            op1 = op2;
            op2 = temp;
        }

        for (int i = 1; i*i <= op1; i++) {

            if (op1 % i == 0 ) {

                if(op1 == i){
                    arrayList.add(i);
                }
                else{
                    arrayList.add(i);
                    arrayList.add(op1/i);
                }
            }
        }

        arrayList.removeIf(integer -> op2%integer!=0);
       
        Collections.sort(arrayList);

        outputWriter.println(arrayList.get(arrayList.size()-k));


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


