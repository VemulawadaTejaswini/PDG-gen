import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
        int n=in.nextInt();
        if(d==0){
            System.out.println(n);
        }else if(d==1){
            System.out.println((long)n*(long)100);
        }else{
            System.out.println((long)n*(long)10000);
        }

    }

}