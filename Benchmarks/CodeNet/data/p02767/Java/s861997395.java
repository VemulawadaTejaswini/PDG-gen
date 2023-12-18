import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            min=Math.min(min,x[i]);
            max=Math.max(max,x[i]);
        }
       int left=min,right=max+1;
       int res=Integer.MAX_VALUE;
       for(int i=left;i<right;i++)
       {
           res=Math.min(res,dis(x,i));
       }
       System.out.println(res);

    }
    public static int dis(int[] x, int p)
    {
        int res=0;
        for(int num: x)
        {
            res+=(num-p)*(num-p);
        }
        return res;
    }
}