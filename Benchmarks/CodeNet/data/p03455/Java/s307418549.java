import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        if (Integer.parseInt(st.nextToken()) % 2 == 0) 
            System.out.print("Even");
        if (Integer.parseInt(st.nextToken()) % 2 == 0) 
            System.out.print("Even");
        System.out.print("Odd");
    }
}