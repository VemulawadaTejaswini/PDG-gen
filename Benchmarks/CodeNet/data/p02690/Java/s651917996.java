import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        for(long i = -1000; i<1000;i++){
            Long A = i * i * i * i * i;
            for(long j = -1000;j<1000;j++){
                Long B = j * j* j * j * j;
                if(A - B == X){
                    System.out.println(i + " " + j);
                    System.exit(0);
                }
            }
        }
    }

}







