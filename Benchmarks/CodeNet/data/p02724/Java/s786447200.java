import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.lang.*;
import java.util.*;
import java.util.concurrent.*;
class Result{
    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);
        long x=s.nextLong();
        long fivehndrd=x/500;
        x=x-fivehndrd*500;
        long five=x/5;
        System.out.println(fivehndrd*1000+five*5);
    }
}    
