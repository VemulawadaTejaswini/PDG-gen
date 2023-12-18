import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long g = getGCD(a, b);
        Map<Long,Integer> map = prime_factor(g);
        map.put(1L,1);
        sc.close();
        System.out.println(map.size());

    }
    public static long getGCD(long a,long b){
        if(b==0){
            return a;
        }else{
            return getGCD(b,a%b);
        }
    }
    public static Map<Long,Integer> prime_factor(long l){

        Map<Long,Integer> map = new HashMap<>();
        long num = l;
        int count;
        for(long i=2;i*i<=num;i++){
            count = 0;
            while(l%i==0){
                count++;
                l/=i;
            }
            if(count>0)map.put(i,count);
        }
        if(l!=1)map.put(l,1);
        return map;
    }
}