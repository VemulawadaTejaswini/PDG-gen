import java.io.*;
import java.util.*;
import java.math.*;
class atcoder{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
      	long max=Long.MIN_VALUE;
		for(long i=a;i<=b;i++){
          for(long j=c;j<=d;j++){
            if(i*j>max)
              max=i*j;
          }
        }
      	System.out.println(max);
    }
}