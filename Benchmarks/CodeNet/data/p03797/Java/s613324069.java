import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        int cnt = 0;
        if(n*2 > m){
            cnt += m/2;
        }else{
            cnt += n;
            m-=n*2;
            cnt+=m/4;
        }
        
        System.out.println(cnt);
    }
}