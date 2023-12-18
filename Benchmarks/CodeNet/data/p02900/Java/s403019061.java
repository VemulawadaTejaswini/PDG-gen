import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long g = getGCD(a, b);
        Map<Integer,Integer> map = prime_factor(g);
        map.put(1,1);
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
    public static Map<Integer,Integer> prime_factor(long l){

        Map<Integer,Integer> map = new HashMap<>();
        long num = l;
        int count;
        for(int i=2;i*i<=num;i++){
            if(l%i==0){
                count = 0;
                while(l%i==0){
                    count++;
                    l/=i;
                }
                map.put(i,count);
            }
        }
        if(l!=1)map.put((int)l,1);
        return map;
    }
}