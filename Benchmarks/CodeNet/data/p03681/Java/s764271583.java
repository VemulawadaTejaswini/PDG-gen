import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        if(Math.abs(N - M)>1){
            System.out.println(0);
            return;
        }
        long nf = 1L;
        long mf = 1L;
        for(int i=1; i<=N; i++){
            nf = nf * i;
            nf = nf % 1000000007;
        }
        for(int i=1; i<=N; i++){
            mf = mf * i;
            mf = mf % 1000000007;
        }
        if(N==M){
            System.out.println((nf * mf * 2) % 1000000007);
        }
        else{
            System.out.println((nf * mf) % 1000000007);
        }
    }
}