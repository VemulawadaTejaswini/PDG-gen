import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        String n = String.valueOf(N);
        int l = n.length();
        long a = 0;
        long x = 0;
        long y = 0;
        long min = N;

        for(int i=1; i<=N*10/Math.pow(10, l/2); i++){
            if(N%i==0){
                a = N / i;
                min = Math.min(min, Math.abs(a-i));
                if(min==Math.abs(a-i)){
                    x = i;
                    y = a;
                }
            }
        }
        System.out.println(x + y - 2);
    }
}