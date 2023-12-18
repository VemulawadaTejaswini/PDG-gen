import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    static int dp[];
    static ArrayList<Integer>arr;
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>=1000 && n<=1998){
            System.out.println("ABD");
        }else{
            System.out.println("ABC");
        }
    }
}