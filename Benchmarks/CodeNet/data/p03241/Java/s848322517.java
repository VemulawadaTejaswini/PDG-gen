import java.util.*;
import java.util.stream.*;

class Main {
    static Scanner s=new Scanner(System.in);
    public static void main(String[]$){
        int n=s.nextInt(),t=s.nextInt();
        for(int i=(t+n)/n*n;i>0;--i) {
            if(t%i==0&&t/i>=n){
                System.out.println(i);
                return;
            }
        }
    }
}
