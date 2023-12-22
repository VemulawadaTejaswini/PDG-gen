import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long[] x=new long[n];
        long[] y=new long[n];
        TreeSet<Long> set=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            x[i]=in.nextLong();
            y[i]=in.nextLong();
            set.add(x[i]+y[i]);
        }
        System.out.println(set.last()-set.first());
        

    }
}