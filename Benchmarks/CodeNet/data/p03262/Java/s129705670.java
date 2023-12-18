import java.util.Scanner;

class Main{
    public static int gcd(int x,int y)
    {
        int r;
        if(y>x){
            r=x;
            x=y;
            y=r;
        }
        while(y>0){
            r=x%y;
            x=y;
            y=r;
        }
        return x;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),a[]=new int[n];
        for(int i=0;i<n;++i){
            a[i]=sc.nextInt();
            a[i]=Math.abs(x-a[i]);
        }
        sc.close();
        for(int i=1;i<n;++i)a[i]=gcd(a[i-1],a[i]);
        System.out.print(a[n-1]);
    }
}