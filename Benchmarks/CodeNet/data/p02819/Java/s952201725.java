import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        
        List<Integer> list = sieve(110000);
        for (Integer i : list) {
            if(i >= x){
                System.out.println(i);
                break;
            }
        }
    }
    
    static List sieve(int x){
        
        List<Integer> list = new ArrayList<>();
        boolean[] p = new boolean[x+1];
        Arrays.fill(p, true);
        
        int sqrt = (int)Math.sqrt(x);
        for(int i = 2; i <= sqrt; i++){
            if(!p[i]) continue;
            for(int j = i; i*j <= x; j++){
                p[i*j] = false;
            }
        }
        for(int i = 2; i <= x; i++){
            if(p[i]) list.add(i);
        }
        return list;
    }
}