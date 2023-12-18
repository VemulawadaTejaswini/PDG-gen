import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner in = new Scanner (System.in);
        long n = in.nextInt ();
        long a = in.nextInt ();
        long b = in.nextInt ();
        if((b-a)%2==0){
            System.out.println ((b-a)/2);
        }
        else if((b-a)%2!=0){
            if((a-1)<=(n-b))
                System.out.println (((b-a)/2 )+ (b-((b-a)/2 )-1));
            else
                System.out.println (((b-a)/2 )+ (n-(a+(int)((b-a)/2 ))));
        }
    }
}
