import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] a = new int[n + 1];
        int[] count = new int[n + 1];
        Arrays.fill(count, Integer.MAX_VALUE);

        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }

        int current = 1;
        int cnt = 0;

        while(count[current] == Integer.MAX_VALUE){
            count[current] = cnt;
            current = a[current];
            cnt++;
        }
        if(current == 1){
            System.out.println("1");
            k %= cnt;
            for(int i = 1; i <= n; i++){
                if(k == count[i]){
                    System.out.println(i);
                }
            }
        }else{
            Arrays.fill(count, Integer.MAX_VALUE);
            int cnt2 = 0;
            while(count[current] == Integer.MAX_VALUE){
                count[current] = cnt2;
                current = a[current];
                cnt2++;
            }
            k -= count[current] - 1;
            k %= cnt2;
            for(int i = 1; i <= n; i++){
                System.out.println(count[i]);
            }

            for(int i = 1; i <= n; i++){
                if(k == count[i]){
                    System.out.println(i);
                }
            }

        }
    }
}