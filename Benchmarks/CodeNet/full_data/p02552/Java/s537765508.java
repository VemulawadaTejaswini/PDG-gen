import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int x=Integer.parseInt(bu.readLine());
        if(x==0) sb.append(1);
        else sb.append(0);
        System.out.print(sb);
    }
}
