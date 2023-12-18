import java.util.*;
import java.io.*;

public class Main {
    public static int firstExplosion(String S){
        for(int i=0;i<S.length();i++){
        	if(S.charAt(i)!='1') return i;
        }
        return 10000000;
    }
    public static char solve(String S, long K){
        if(firstExplosion(S)<K) return S.charAt(firstExplosion(S));
        else return S.charAt((int)K-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        System.out.println(solve(S,K));
    }
}