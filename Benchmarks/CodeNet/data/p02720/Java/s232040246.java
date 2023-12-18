import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.Comparator.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
        int k=s.nextInt();
        HashMap<Integer,List<String>> map=new HashMap<>();
        List<String> list=new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        map.put(1,new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9")));
        int val=2;
        while(list.size()<k)
        {
            List<String> mid=new ArrayList<>();
            List<String> l=map.get(val-1);
            for(String str:l)
            {
                StringBuilder b=new StringBuilder(str);
                int v=Character.getNumericValue(str.charAt(str.length()-1));
                if(v==0)
                {
                    b.append('0');
                    mid.add(b.toString());
                    b=new StringBuilder(str);
                    b.append('1');
                    mid.add(b.toString());
                }
                else if(v==9)
                {
                    b.append('8');
                    mid.add(b.toString());
                    b=new StringBuilder(str);
                    b.append('9');
                    mid.add(b.toString());
                }
                else {
                    for(int i=v-1;i<=v+1;i++)
                    {
                        b.append(i);
                        mid.add(b.toString());
                        b=new StringBuilder(str);
                    }
                }
            }
            map.put(val,new ArrayList<>(mid));
            list.addAll(new ArrayList<>(mid));
            val++;
        }
//        for(String str:list)
//        {
//            System.out.println(str);
//
//        }
        System.out.println(list.get(k-1));

    }

}


class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}