import java.util.Scanner;

public class Main {

    public static int Max;

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
	    int x=scan.nextInt();
        int y=scan.nextInt();

        Common_Divisir(x,y);

        System.out.println(Max);
    }

    public static void Common_Divisir(int a, int b)
    {
        int c=a%b;
        if(c!=0){
            a=b;
            b=c;
            Common_Divisir(a,b);
        }
        if(c==0){
            Max=b;
        }
    }
}