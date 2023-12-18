import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int a = in.nextInt ();
        int b = in.nextInt ();
        if(a==b)
            System.out.println (0);
        else if((b-a)%2==0){
            System.out.println ((b-a)/2);
        }
        else if((b-a)%2!=0){
            if((a-1)<=(n-b))
                System.out.println (((b-a)/2 )+ (b-((b-a)/2 )-1));
            else
                System.out.println (((b-a)/2 )+ (n-(a+((b-a)/2 ))));
        }
    }
}
