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

        // }   
        int N;
        N=in.nextInt();
        in.nextLine();
        Set<String> set=new HashSet<>();
        for(int i=0;i<N;i++)
        {
            set.add(in.nextLine());
        }
        System.out.println(set.size());

    }

}