import java.util.*;

public class Main{
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long l = 1;
        long r = n;
        long max = 0;
        while(l <= r){
            long center = (l + r)/2;
            long temp = a*center/b - center/b*a;
            if(max < temp){
                max = temp;
            }
            if(temp < 0){
                r = center-1;
            }else {
                break;
            }
        }
        for(long i=l; i<=r; i++){
            long temp = a*i/b - i/b*a;
            if(max<temp){
                max=temp;
            }
        }
        System.out.println(max);
    }
}