//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s=br.readLine().trim();
        if(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}