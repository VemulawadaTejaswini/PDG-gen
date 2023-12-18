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

        long ans = max;
        while(true){
            boolean flag = true;
            for(int i = 0;i < n;i++){
                if(ans % t[i] != 0)flag = false;
            }

            if(flag)break;
            ans += max;
        }

        System.out.println(ans);
    }
}
