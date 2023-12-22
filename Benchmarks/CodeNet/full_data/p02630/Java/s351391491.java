import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int a = sc.nextInt();
            sum += a;
            map.merge(a,1,Integer::sum);
        }
        int q = sc.nextInt();
        for(int i = 0 ; i < q ;i++){
            int b = sc.nextInt();
            map.merge(b,0,Integer::sum);
            int c = sc.nextInt();
            map.merge(c,0,Integer::sum);
            sum += (c-b)*map.get(b);
            System.out.println(sum);
            map.merge(c,map.get(b),Integer::sum);
            map.put(b,0);
        }
    }
}