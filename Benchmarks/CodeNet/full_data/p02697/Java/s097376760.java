import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n%2==0) {
            int a = n / 2;
            int b = a + 1;


            for (int i = 0; i < m; i++) {
                System.out.println(a + " " + b);
                b++;
                a--;
            }
        }
        else
        {
            int a =2;
            int b = n-2;
            for (int i = 0; i < m; i++) {
                System.out.println(a + " " + b);
                b--;
                a++;
            }
        }

    }
}
