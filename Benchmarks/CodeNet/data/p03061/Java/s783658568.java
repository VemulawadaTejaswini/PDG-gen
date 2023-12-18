import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] list = new int[N];
        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(sc.next());
        }
        int[] listA = new int[N];
        int[] listB = new int[N];
        listA[0] = list[0];
        listB[N-1] = list[N-1];
        for(int i=1;i<N;i++){
            listA[i] = gcd(listA[i-1],list[i]);
            listB[N-1-i] = gcd(listB[N-i], list[N-i-1]); 
        }
        int ans = 0;
        for(int i=0;i<N;i++){
            if(i==0){
                ans= Math.max(ans,listB[i+1]);
            }else if(i==N-1){
                ans= Math.max(ans,listA[i-1]);
            }else{
                ans= Math.max(ans,gcd(listA[i-1],listB[i+1]));
            }
        }
        System.out.println(ans);
    }
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}

