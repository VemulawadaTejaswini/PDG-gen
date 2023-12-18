import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] S = new String[N];
        for(int i = 0; i < N; i++){
            S[i] = sc.next();
        }
        sc.close();
        long m = 0;
        long a = 0;
        long r = 0;
        long c = 0;
        long h = 0;
        LongSummaryStatistics= 0;
        for(int i = 0; i < N; i++){
            if(S[i].charAt(0) == 'M')
                m++;
            if(S[i].charAt(0) == 'A')
                a++;
            if(S[i].charAt(0) == 'R')
                r++;
            if(S[i].charAt(0) == 'C')
                c++;
            if(S[i].charAt(0) == 'H')
                h++;
        }
        long sum = 0;
        sum += m*a*r +
                m*a*c +
                m*a*h +
                m*r*c +
                m*r*h +
                m*c*h +
                a*r*c +
                a*r*h +
                a*c*h +
                r*c*h;

        System.out.println(sum);
    }
}