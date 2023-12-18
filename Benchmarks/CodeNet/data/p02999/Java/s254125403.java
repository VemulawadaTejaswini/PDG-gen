//package Hello.World;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int x  = Integer.parseInt(st.nextToken());
        int a  = Integer.parseInt(st.nextToken());
        if(x<a)
            out.println(0);
        else
            out.println(10);

        out.flush();
    }

}
