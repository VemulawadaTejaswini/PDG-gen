import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a=n/2;
        int b= a+1;

        for(int i=0;i<m;i++)
        {
            System.out.println(a+" "+b);
            b++;
            a--;
        }

    }
}
