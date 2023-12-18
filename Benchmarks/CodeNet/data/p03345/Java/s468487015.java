import java.util.Scanner;

class taka {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();long t1=0,h1=0,n1=0;
        int n=sc.nextInt();
        int h=sc.nextInt();
        long k=sc.nextLong();
        if(k==0)System.out.println("-1");
        else if(k>Integer.MAX_VALUE)System.out.println("0");
        else
        {
            while(k-->0)
            {
                t1=(n+h);
                n1=t+h;
                h1=t+n;
                t=(int)t1;
                n=(int)n1;h=(int)h1;


            }

            if( Math.abs(t1-n1)>(10^18))System.out.println("Unfair");
            else System.out.println( Math.abs(t1-n1));
        }}
}
