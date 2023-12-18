import java.util.Scanner;

class Main{

    static long moves =0;

    public static long move(long n)
    {
        if(n==1)
            return 1;

        else
        {
            return 1+move(n/2)+move(n/2);
        }
    }



    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();

//        while(h>0)
//        {
//            if(h==1) {
//                h -= 1;
//                moves++;
//            }
//
//            else
//            {
//                h=2*(h/2);
//                moves+=2;
//            }
//        }

        System.out.println(move(h));
    }
}
