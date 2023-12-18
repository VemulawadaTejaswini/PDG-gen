import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
        int[] m = new int[n];
        long answer = 1;

        if(sc.nextInt() != 0) answer = 0;
        for(int i = 1; i < n; i++){
            m[sc.nextInt()]++;
        }

        for(int i = 2; i < n; i++){
            if(m[i] != 0) answer *= ((long)Math.pow(m[i-1], m[i]));
        }

        System.out.println(answer);

    }

}
