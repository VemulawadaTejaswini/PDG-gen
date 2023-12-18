import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        long a=0;
        long b=1;
        long c=0;
        long d=0;
        long e=0;
        String S[]=new String[N];
        int s[]=new int[5];
        Arrays.fill(s,0);
        for(int i=0;i<N;i++){
        S[i]=sc.next();
    }
        for(int i=0;i<N;i++){
            if(S[i].charAt(0)=='M')s[0]++;
            if(S[i].charAt(0)=='A')s[1]++;
            if(S[i].charAt(0)=='R')s[2]++;
            if(S[i].charAt(0)=='C')s[3]++;
            if(S[i].charAt(0)=='H')s[4]++;
        }
        for(int i=0;i<5;i++){
            if(s[i]>0)a++;
            if(s[i]>1){
                for(int j=s[i];j>0;j--){
                    c++;
                    d++;
                }
                b=b*c;
                e=e+d-1;
                c=0;
            }
        }
        if(a<=3){
            System.out.println(C(a)*b);
        }else{
        System.out.println(C(a)*b-e);
        }
    }
    long C(long s){
        long a=s;
        for(long i=s-1;i>1;i--){
            a=a*i;
        }
        return a/6;
    }
}
