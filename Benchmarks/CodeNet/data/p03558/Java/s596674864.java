import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = 0;
        int tmp = 0;
        int wa = 0;
        int min = 1000000;
        for(int i=1; i<Math.min(2100000000/k , 1000000); i++){
            if(i%10==0) continue;
            n = n+k;
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
