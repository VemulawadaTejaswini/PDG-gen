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
        long ans=0;
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
            for(int j=i+1;j<5;j++){
                for(int k=j+1;k<5;k++){
                    ans+=s[i]*s[j]*s[k];
                }
            }
        }
        System.out.println(ans);
    }
}