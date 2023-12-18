import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        long n = 0;
        long tmp = 0;
        long wa = 0;
        long min = 1000000;
        for(int i=1; i<70000000; i++){
            if(i%10==0) continue;
            n = n+k;
            if(n<=0) break;
            tmp = n;
            wa = 0;
            while(tmp>0){
                wa += tmp%10;
                tmp /= 10;
            }
            if(min > wa) min = wa;
        }
        
        System.out.println(min);
    }
}
