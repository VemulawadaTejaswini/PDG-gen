import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        String[] s1 = s.split("");
        if(s.substring(a, 1) == "-" &&  a+b+1==s1.length){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




    }
}