import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s=bu.readLine();
        String ans="";
        if(s.equals("ABC")) ans="ARC";
        else ans="ABC";
        System.out.print(ans);
    }
}
