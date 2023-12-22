import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] x=new double[n];
        double[] y=new double[n];
        int i;
        for(i=0;i<n;i++)x[i]=sc.nextDouble();
        for(i=0;i<n;i++)y[i]=sc.nextDouble();
    
        System.out.println(getD(x,y,n,1));
        System.out.println(getD(x,y,n,2));
        System.out.println(getD(x,y,n,3));
        System.out.println(getCD(x,y,n));
    }
    
    static double getD(double x[],double y[],int n,int p){
        double d=0;
        for(int i=0;i<n;i++)d+=Math.pow(Math.abs(x[i]-y[i]),p);
        if(p==1)return d;
        else if(p==2)return Math.sqrt(d);
        else if(p==3)return Math.cbrt(d);
        else return -1;
    }
    static double getCD(double x[],double y[],int n){
        double max=0;
        for(int i=0;i<n;i++)if(max<Math.abs(x[i]-y[i]))max=Math.abs(x[i]-y[i]);
        return max;
    }
}

