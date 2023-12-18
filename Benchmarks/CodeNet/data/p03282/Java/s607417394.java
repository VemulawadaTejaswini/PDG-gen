import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        long K = sc.nextLong();
        int l = S.length();

        for(int i=0; i<l; i++){
            if(!S.substring(i,i+1).equals("1")){
                if(i<K){
                    System.out.println(S.substring(i, i+1));
                    break;
                }
            }
            if(i==l-1){
                System.out.println(1);
            }
        }
    } 
}