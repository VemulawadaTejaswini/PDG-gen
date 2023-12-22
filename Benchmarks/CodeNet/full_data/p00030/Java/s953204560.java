import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int s = sc.nextInt();
            if(n==0 && s==0) break;
            int ans = 0;
            for(int i = 0; i < (1<<10); i++){
                int sum = 0;
                int f = 0;
                for(int j = 0; j < 10; j++){
                    if((1 & i >> j) == 1) {
                        sum += j;
                        f++;
                    }
                }
                if(sum == s&&f == n) ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
