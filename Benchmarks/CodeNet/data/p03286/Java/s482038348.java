import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = "";
        if(N==0){
            System.out.println(0);
            return;
        }
        for(int i=0; i<1000; i++){
            int n = Math.abs(N);
            if(N%2==0){
                S += 0;
            }
            else{
                S += 1;
            }
            N -= n % 2;
            N /= -2;
            if(N==0){
                break;
            }
        }

        StringBuffer str = new StringBuffer(S);
        S = str.reverse().toString();
        System.out.println(S);
    }
}