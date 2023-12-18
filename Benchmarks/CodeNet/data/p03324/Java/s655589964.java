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
            if(n<100)
            System.out.println(n);
            else if(n==100){
                System.out.println(101);
            }
        }else if(d==1){
            if(n<100)
            System.out.println((long)n*(long)100);
            else if(n==100){
                System.out.println(10100);
            }
        }else{
            if(n<100)
            System.out.println((long)n*(long)10000);
            else if(n==100){
                System.out.println(1010000);
            }
        }

    }

}