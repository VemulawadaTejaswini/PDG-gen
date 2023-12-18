import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         long c = sc.nextLong();

        int max = -1000000;
        for(int i=0;i<10000000&&i<=c;i++)
        {
            int fc =(int)((a*i)/b) -(a*(int)(i/b));
            if(fc>max)
            {
                //System.out.println(fc+" "+i);
                max=fc;
            }
        }
        System.out.print(max);
    }
}
