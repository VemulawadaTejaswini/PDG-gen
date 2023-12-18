import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
        Set<Long> set_a = new HashSet<Long>();
        Set<Long> set_b = new HashSet<Long>();

        for(long i = 2; i <= a; i++){
            if(a % i == 0) set_a.add(i);
            else continue;
            while(a % i == 0){
                a /= i;
            }
            if(a == 1) break;
        }
        // for(long i = 2; i <= b; i++){
        //     if(b % i == 0) set_b.add(i);
        //     else continue;
        //     while(b % i == 0){
        //         b /= i;
        //     }
        //     if(b == 1) break;
        // }

        long count = 0;
        // if(set_a.size() < set_b.size()){
        //     for(long x: set_a){
        //         if(set_b.contains(x)) count++;
        //     }
        // }else{
        //     for(long x: set_b){
        //         if(set_a.contains(x)) count++;
        //     }
        // }
        for(long x: set_a){
            if(b % x == 0) count++;
        }

        System.out.println(count + 1);

    }

}
