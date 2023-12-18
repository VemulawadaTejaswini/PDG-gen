import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double s = w*h/2;
        int e =0;
        if(x == w/2 && y ==h/2){
            e =1;
        }else{
            e = 0;
        }



        System.out.println(s);
        System.out.println(e);

    }
}