import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

public class Main {
    static int[] match = new int[]{
            10,2,5,5,4,5,6,3,7,6
    };

    static int minimumMatch(Set<Integer> A){
        int ans = 10;
        for(int a:A) ans = Math.min(ans, match[a]);
        return ans;
    }
    static int maximumMatch(Set<Integer> A){
        int ans = 0;
        for(int a:A) ans = Math.max(ans, match[a]);
        return ans;
    }

    static int totalMatch(int[] a){
        int ans = 0;
        for(int i:a) ans += match[i];
        return ans;
    }
    static int totalMatch(int a){
        int ans = 0;
        while(a>0){
            ans += match[a%10];
            a /= 10;
        }
        return ans;
    }
    static boolean allDigitsIncluded(Set<Integer> A, int[] a){
        for(int i:a) if(!A.contains(i)) return false;
        return true;
    }
    static boolean allDigitsIncluded(Set<Integer> A, int a){
        while(a>0){
            if(!A.contains(a%10)) return false;
            a /= 10;
        }
        return true;
    }
    static int bruteforce(int digits, Set<Integer> A, int N){
        assert digits<=6;
        int ans = -1;
        for(int num=0; num<100000000; num++){
            if(String.valueOf(num).length()>digits)break;
            if(!allDigitsIncluded(A, num)) continue;
            if(totalMatch(num)==N) ans = num;
        }
        if(ans<0) System.exit(1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> A = new HashSet<>();
        for(int m=0; m<M; m++) A.add(sc.nextInt());

        int digits = N / minimumMatch(A);
        int[] ans = new int[digits];
        while(digits>6){
            int thisDigit = 0;
            for(int i:A){
                if(A.contains(i) && N-match[i] >= minimumMatch(A)*(digits-1) && N-match[i] <= maximumMatch(A)*(digits-1)){
                    thisDigit = Math.max(thisDigit, i);
                }
            }
            System.out.print(thisDigit);
            digits--;
            N -= match[thisDigit];
        }
        System.out.println(bruteforce(digits, A, N));


    }
}
