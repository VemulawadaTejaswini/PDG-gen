import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static final int MAX = 5000+24;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(in.hasNext()) {
            int n=in.nextInt();
            out.println(24+(24-n));
            out.flush();
        }
        in.close();
        out.close();
    }

}
