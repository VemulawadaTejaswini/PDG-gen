import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        PriorityQueue q=new PriorityQueue();
        long maxnum=(long)Math.sqrt(n);
        for(long i=1;i<=maxnum;i++){
            if(n%i==0){
                q.add(i-1+n/i-1);
            }
        }
        System.out.println((q.peek()==null ? 0 : q.remove()));
    }
}