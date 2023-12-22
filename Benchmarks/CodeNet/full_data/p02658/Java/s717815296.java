import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());

        long sum = 1;


        for(int i = 0; i < a; i++)
        {
            sum*= Long.parseLong(scanner.next());

        }

        if(sum > (long) 1000000000000000000.0)
        {
            sum = -1;
        }
        System.out.println(sum);


        out.close();
    }
}