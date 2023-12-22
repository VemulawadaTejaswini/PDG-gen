import java.util.*;

class Main {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        
        int nn=0;
        int[] N=new int[n];
        while(n-->0)
        {
            N[nn]=in.nextInt();
            nn++;
        }
        int count=0;
        for(int i =0;i<N.length-1;i++)
        {
            for(int j=i+1;j<N.length;j++)
            {
                if(j-i==N[i]+N[j]) count++;
            }
        }
        System.out.println(count);
    }
}