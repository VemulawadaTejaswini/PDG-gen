import java.util.*;

class Main{

    public static void main(String[] args){
        int d,r;
        double a,b,f;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        if( b==0 ){
            b = 1;
        }
        d = (int)(a/b);
        r = (int)(a%b);
        f = 1/b;
        System.out.println(String.valueOf(d) + " " + String.valueOf(r) + " " + String.valueOf(f))
   }
}