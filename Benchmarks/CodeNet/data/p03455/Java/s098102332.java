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
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.print("Even");
        }
        else {
            System.out.print("Odd");
        }
    }
}