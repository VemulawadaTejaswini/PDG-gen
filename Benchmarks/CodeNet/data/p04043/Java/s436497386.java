// Created By Jefferson Samuel on 02/09/20 at 1:02 AM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

public class C {


static ArrayList<String> lis = new ArrayList<>();
static void spacing(String sofar , String orig)
{
if(orig.length() ==0){
    lis.add(sofar.trim());
    }
else
{

        sofar += orig.charAt(0);
        spacing(sofar + " ", orig.substring(1));
        spacing(sofar, orig.substring(1));
        sofar = "";

}
}
    static void solve() throws Exception {

    int fc = 0 ,sc = 0;
    for(int i = 0 ; i < 3;i++)
    {
        int f = scanInt();
        if(f == 5) fc++;
        else if(f == 7) sc ++;
    }
    out.println(fc == 2 && sc == 1 ? "YES":"NO");


    }






    //Dont touch this side
    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }
    static  String scanFullString() throws  IOException{
        return in.readLine();
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }
    static long pow(int a,  int b)
    {
        if(b == 0) return 1;
        long tmp  = pow(a,b/2);
        return  tmp*tmp * (b%2 == 0 ? 1 : a);
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}