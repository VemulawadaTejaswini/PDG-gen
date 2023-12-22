import java.util.*;

public class Main {

    public static void main(String[] args){
        Main m = new Main();
        m.run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);

        for(;;){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            int[] s = new int[n];
            for(int i =0 ; i < n ; i++){
                s[i] = sc.nextInt();
            }
            System.out.println(solve(s));

        }
    }

    int solve(int[] s){
        int min = s[0];
        int max = s[0];
        long sum = 0L;

        for(int i = 0; i < s.length; i++){
            min = Math.min (min, s[i]);
            max = Math.max(max,s[i]);
            sum += s[i];
        }

        return (int)(sum - min -max )/ (s.length-2);

    }

}