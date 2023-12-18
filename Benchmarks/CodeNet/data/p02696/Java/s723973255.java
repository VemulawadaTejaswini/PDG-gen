import java.io.*;
import java.util.*;
class Main
{
public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String S=br.readLine();
    String tokens[]=S.split(" ");
    long A=Long.parseLong(tokens[0]);
    long B=Long.parseLong(tokens[1]);
    long N=Long.parseLong(tokens[2]);
    long start=1;
    long max;
    if (A>B)
        max=call_result(A,B,N,start);
    else
        {
             start=find_x_at_which_AGB(A,B,N);
            max=call_result(A,B,N,start);
        }
        System.out.print(max);
    }
static long  find_x_at_which_AGB(long A,long B,long N){
        long st=1;
        for(long x=1;x<N;x++)
        {
            long mul=A*x;
            if(mul>B)
               { st=x;
                   break;
        }
    }
        return st;

    }
    static long call_result(long A,long B,long N,long x)
    {
        long get_max=0;
        for(long initial=x;initial<=N;initial++){
    long Floor=(int)(Math.floor((A*initial)/B))-(A*(int)Math.floor(initial/B));
    if(Floor>0)
    {
            get_max=Math.max(get_max,Floor);
    }
}
    return get_max;
}
}
