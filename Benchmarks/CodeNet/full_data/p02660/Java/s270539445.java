import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.awt.Point;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();

        if(N==1) {
            System.out.println(0);
            return;
        }
        if(N==2 || N==3) {
            System.out.println(1);
            return;
        }

        for(int i=2; i<=Math.sqrt(N); i++) {
            if(N%i==0) {
                break;
            }
            if(i==(int)Math.sqrt(N)) {
                System.out.println(1);
                return;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        loop:for(int i=4; i<=Math.sqrt(N); i++) {
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j==0) {
                    continue loop;
                }
            }
            list.add(i);
        }

        ArrayList<Long> al = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            long a = 1L;
            while(a<=N) {
                a *= list.get(i);
                al.add(a);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        long ans = 0L;
        for(int i=0; i<al.size(); i++) {
            if(N%al.get(i)==0) {
                ans += 1L;
                N /= al.get(i);
            }
            if(N==1) {
                break;
            }
        }
        System.out.println(ans);
    } 
}