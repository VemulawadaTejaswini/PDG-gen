import java.util.Scanner;
import java.util.*;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int[]  arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
int sum =0;
        for(int i =0;i<n;i++){
            int f = sc.nextInt();
            map.put(f,map.getOrDefault(f, 0)+1);
            sum+=f;
        }
        int q = sc.nextInt();
        while(q-->0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(map.containsKey(b)){
                int num = map.get(b);

                sum+= num*(c-b);
                map.remove(b);
                map.put(c,map.getOrDefault(c, 0)+num);
            }
            System.out.println(sum);

        }
        sc.close();
    }
}