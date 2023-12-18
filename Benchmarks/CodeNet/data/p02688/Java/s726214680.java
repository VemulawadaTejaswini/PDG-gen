import java.util.*;
 
class Main {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        in.nextLine();
        int[]N=new int[n];
        int d=in.nextInt();
        while(d>0)
        {
            int ii=in.nextInt();
            
            N[ii-1]=1;
            d--;
            if(d==0&&in.hasNextInt())
            d=in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(N[i]==0) count++;
        }
        System.out.println(count);
        
        
    }
}