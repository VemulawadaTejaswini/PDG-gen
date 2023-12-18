import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        sc.close();
        Queue<Integer> q=new ArrayDeque<>();
        int len=str.length();
        double gt=0;
        for(long bit=0;bit<(1<<len-1);bit++){
            for(int i=0;i<len-1;i++){
                if((bit&(1<<i))>0){
                    q.add(i);
                }
            }
            int count=0;
            while(q.peek()!=null){
                gt+=Double.parseDouble(str.substring(count,q.peek()+1));
                count=q.remove()+1;
            }
            gt+=Double.parseDouble(str.substring(count));
        }
        System.out.println(String.format("%.0f", gt));
    }
}