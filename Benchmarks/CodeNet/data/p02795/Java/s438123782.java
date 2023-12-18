import java.util.*;
import java.io.*;
class Main 
{
    public static void main (String[] args)throws IOException 
    {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int max = Math.max(w, h);
        int n = in.nextInt();
        int x = (int)Math.ceil((double)n / max);
        System.out.println(x);
    }
}