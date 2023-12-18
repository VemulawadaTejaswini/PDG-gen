import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine()),i;
        HashMap<String,Integer> hm=new HashMap<>();
        for(i=0;i<n;i++)
        {
            String s=bu.readLine();
            if(hm.get(s)==null) hm.put(s,1);
            else hm.put(s,hm.get(s)+1);
        }
        System.out.print(hm.size());
    }
}
