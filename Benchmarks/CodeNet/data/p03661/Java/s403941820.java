import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int X=0,x=0;
        double min=1000000000;
        double[] a=new double[200000];

        for(int i=0;i<N;i++){
            a[i]=scan.nextInt();
            x+=a[i];
        }

        for(int i=0;i<N;i++)
        {
            X+=a[i];
            if(i+1<N){
                min=Minimum(min,Math.abs(x-2*X));
            }
        }

        System.out.println((int)min);
    }

    public static double Minimum(double a, double b)
    {
        if(a>b) return b;
        else return a;
    }
}