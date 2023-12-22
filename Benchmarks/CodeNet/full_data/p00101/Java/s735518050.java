import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(input.nextLine());

        for(int i = 0; i < N; i++) {
            String s = input.nextLine().replaceAll("Hoshino", "Hoshina");

            out.println(s);
        }
        out.flush();
        out.close();
System.exit(0);
    }
}