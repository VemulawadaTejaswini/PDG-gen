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
        long a=in.nextLong();
        long b=in.nextLong();
        long c=in.nextLong();
        long d=in.nextLong();
        System.out.println(Math.max(Math.max(a*c, a*d), Math.max(b*c, b*d)));
        
        
    }
}