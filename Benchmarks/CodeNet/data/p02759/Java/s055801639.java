import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(scan.nextLine());
        
        out.println(n % 2 == 0 ? n / 2 : n / 2 + 1);
        out.close();
        
    }
}