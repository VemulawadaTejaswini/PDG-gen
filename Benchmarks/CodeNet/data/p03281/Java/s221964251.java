import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());

        int count = 0;
        int ans = 0;
        for(int i = 1; i <= N; i+=2){

            count = 0;

            for(int j = 1; j <= N; j+=2){
                if(i%j == 0) count++;
            }
            if(count == 8) ans ++;
        }

        System.out.println(ans);

    }
}