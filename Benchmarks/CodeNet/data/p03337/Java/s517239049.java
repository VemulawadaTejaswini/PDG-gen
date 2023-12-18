import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( Max( Max( a+b, a-b ), a*b) );
    }
    public static int Max (int p, int q){
        int res;
        if( p >= q ) res = p;
        else         res = q;
        return(res);
    }
}