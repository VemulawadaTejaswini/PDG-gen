import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        while (true){
            c=c-b;
            a=a-d;
            //System.out.println("aoki:="+c);
            //System.out.println("takahasi:="+a);
            //System.out.println("  ");






            if(c<=0){
                System.out.println("Yes");
                break;
            }
            else if(a<=0){
                System.out.println("No");
                break;
            }

        }


    }


}

