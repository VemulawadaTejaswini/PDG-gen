import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(judge(x));
    }
    static long judge(long x){
        long r = (x/11)*2;
        x%=11;
        if(x>6){
            r+=2;
        }else if(x>0){
            r+=1;
        }
        return r;
    }
}