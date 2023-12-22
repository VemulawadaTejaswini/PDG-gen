import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long S = -200L;
        long L = 200L;
        long a = 0L;
        long b = 0L;

        for(long i = S;i <= L;i++){
            for(long j = S;j <= L;j++){
                long A = i*i*i*i*i;
                long B = j*j*j*j*j;
                if(x == A-B){
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        System.out.println(a+" "+b);
    }
}