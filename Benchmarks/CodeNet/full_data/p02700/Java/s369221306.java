import java.util.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int a;
        int c;

        if(A%D==0){
            a = A / D;
        }
        else{
            a = A / D + 1;
        }
        if(C%B==0){
            c = C / B;
        }
        else{
            c = C / B + 1;
        }

        if(c<=a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}