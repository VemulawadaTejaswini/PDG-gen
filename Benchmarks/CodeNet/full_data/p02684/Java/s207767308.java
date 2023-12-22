import java.util.*;
import java.math.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
public class Main {
    public static void main(String args[])throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        long k = (long) in.nval;
        int c[] = new int[n];
        for(int i=0;i<n;i++)
        {
            in.nextToken();
            c[i]= (int) in.nval;
        }
        boolean dui[] = new boolean[200000];
        int a[] = new int[n];
        int p=1,q=0,l=0,r=0;
        a[0] = 1;
        dui[1] = true;
        while(p<n&&dui[c[q]]==false)
        {
            a[p++] = c[q];
            if(dui[c[q]] == true)
            {
                r = c[q];
                break;
            }
            else{
                dui[c[q]] = true;
                q = c[q]-1;
            }
            
        }
        r = c[q];
        for(int i=0;i<n;i++)
        {
            if(a[i]==r&&p!=i)
            {
                l=i;
                break;
            }
            
        }
        out.println(a[l+(int)((k-(long)l)%(long)((Math.abs(p-l))))]);
        out.flush();
    }
}