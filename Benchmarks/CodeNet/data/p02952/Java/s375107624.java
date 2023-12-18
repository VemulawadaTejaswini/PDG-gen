
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        sc.close();
        for(int i=1;i<=n;i++){
            if(digit(i)%2==1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static int digit(int x){
        int res = 0;
        while(x > 0){
            x/=10;
            res++;
        }
        return res;

    }

}