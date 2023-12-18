import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        long X = sc.nextLong();
        long a = 100;

        for(int i=1; i<=10000; i++){
            a = (long)(a * 1.01);
            if(a>=X){
                System.out.println(i);
                return;
            }
        }
    }
}