import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
         long c = sc.nextLong();

        int max = -1000000;

        long alpha = Math.max(1,long(b/a));



        for(double i=0;i<=c;i=(i+alpha))
        {
            int fc =(int)((a*i)/b) -(a*(int)(i/b));
            if(fc>max)
            {
                System.out.println(fc+" "+i);
                max=fc;
            }
        }
        System.out.print(max);
    }
}
