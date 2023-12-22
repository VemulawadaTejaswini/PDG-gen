import java.util.*;

class Main{
    static int num = 1000*2+1;
    static int max = 1000;
    static long[][] dp = new long[num+1][num+1];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        for(int i=0;i<=max*2;i++){
            long it = i-max;
            long a = pow5(it);
            for(int j=0;j<=max*2;j++){
                long jt = j-max;
                long b = pow5(jt);
                if(x==(a-b)){
                    System.out.println(it + " " + jt);
                    return;
                }
                else if(x==(b-a)){
                    System.out.println(jt + " " + it);
                    return;
                }
            }
        }

    }

    private static Long pow5(Long x) {
        return x*x*x*x*x;        
    }
}
