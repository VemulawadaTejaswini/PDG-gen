import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        //System.out.print(V+" "+E);
        sc.nextLine();
        int first[]=new int[E];
        int second[]=new int[E];
        for(int i=0;i<E;i++)
        {
                 first[i]=sc.nextInt();
                 second[i]=sc.nextInt();
                 sc.nextLine();
        }
        int longest[]=new int[E];
        Arrays.fill(longest, 1);
        int max=1;
        for(int i=1;i<E;i++)
        {
            for(int j=0;j<i;j++)
            {
             if(first[i]==second[j]&&longest[j]+1>longest[i])
               {
                   longest[i]=longest[j]+1;
               }
            }
            if(longest[i]>max)
             max=longest[i];
        }
        System.out.println(max);
        sc.close();
    }
}