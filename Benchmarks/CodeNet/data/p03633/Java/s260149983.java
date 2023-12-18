import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long max = 0;
        long t[] = new long[n];
        for(int i = 0;i < n;i++){
            t[i] = scan.nextLong();
            max = Math.max(t[i], max);
        }

        List<Long> list = new LinkedList<>();
        for(int i = 0;i < n;i++){
            if(max % t[i] != 0)list.add(t[i]);
        }
        long ans = max;
        while(true){
            boolean flag = true;
            for(int i = 0;i < list.size();i++){
                if(ans % list.get(i) != 0)flag = false;
            }

            if(flag)break;
            ans += max;
        }

        System.out.println(ans);
    }
}
