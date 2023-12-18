import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int m = 10000;
        for(int i = 0;i < N;i++){
            int ci = sc.nextInt();
            int ti = sc.nextInt();
            if(ti <= T) m = Math.min(m, ci);
        }
        if(m == 10000)  System.out.println("TLE");
        else System.out.println(m);
    }
}