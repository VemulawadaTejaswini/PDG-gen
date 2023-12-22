import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.*;

class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}



public class Main {

    public static PrintWriter out;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int lastDigit = n%10;
        if (lastDigit==2||lastDigit==4||lastDigit==5||lastDigit==7||lastDigit==9){
            out.println("hon");
        }else if (lastDigit==0||lastDigit==1||lastDigit==6||lastDigit==8){
            out.println("pon");
        }else {
            out.println("bon");
        }
        out.close();
    }

}
