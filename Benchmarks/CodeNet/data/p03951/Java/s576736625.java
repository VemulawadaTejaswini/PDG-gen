import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N;
        String s, t;
        N = scanner.nextInt();
        int ans = N;
        scanner.nextLine();
        s = scanner.nextLine();
        t = scanner.nextLine();


        int cnt = 0;
        for(int i  = 0; i < N; i++){
            for(int j = i; j < N; j++){
                if(s.charAt(j) == t.charAt(j - i))cnt++;

            }

            if(cnt == N - i){
                ans = i;
                break;
            }

        }

        System.out.println(ans + N);

    }


}
