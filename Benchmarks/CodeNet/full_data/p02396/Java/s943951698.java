import java.io.*;

class PrintTestCases {
    public static void main(String args[]) throws IOException {
        DataInputStream scan = new DataInputStream(System.in);

        while(true) {
            String s = scan.readLine();
            if(s == null) break;

            int a = Integer.parseInt(s);
            System.out.println(a);
        }
    }
}