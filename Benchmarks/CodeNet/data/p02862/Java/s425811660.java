import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long y = (2*Y-X);
        if(y%3!=0) System.out.println(0);
        else{
            y/=3;
            long x = Y-2*y;
            long x2=1;
            ArrayList<Long> X2 = new ArrayList<>();
            for(long i=1;i<=x;) {
                if(x2*i>1000000007) {
                    X2.add(x2);
                    x2 =1;
                }
                else i++;
            }
            long y2 =1;
            ArrayList<Long> Y2 = new ArrayList<>();
            for(long i=1;i<=y;) {
                if(y2*i>1000000007) {
                    Y2.add(y2);
                    y2 =1;
                }
                else i++;
            }
            long n = 1;
            for(long i=1;i<=x+y;i++) n = n*i%1000000007;
            long sum = n;
            for(int i=0;i<X2.size();i++) sum/=X2.get(i)%1000000007;
            for(int i=0;i<Y2.size();i++) sum/=Y2.get(i)%1000000007;
            System.out.println(sum);
        }
    }
}
