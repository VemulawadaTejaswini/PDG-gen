import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // int T;
        // T=in.nextInt();
        // while((T--)>0)
        // {
        //     //code comes here
        //     int S,W;
        //     S=in

        // }   

        int S,W;
        S=in.nextInt();
        W=in.nextInt();
        if(W>=S)
        System.out.println("unsafe");
        else
        System.out.println("safe");
    }

}