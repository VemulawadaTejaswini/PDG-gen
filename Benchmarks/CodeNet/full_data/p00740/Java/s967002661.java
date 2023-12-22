import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/06.
 */
public class Main {
    public static void main(String args[]){
        int n, p, max_p, token;
        int candidate[] = new int[50];
        Scanner sc = new Scanner(System.in);
        while(true){
            n = sc.nextInt();
            p = sc.nextInt();
            max_p = p;
            token = 0;
            if(n == 0 && p == 0) break;
            for(int i = 0; i < n; i++) candidate[i] = 0;
            while(true){
                if(p == 0){
                    p = candidate[token];
                    candidate[token] = 0;
                } else {
                    candidate[token]++;
                    p--;
                }
                if(candidate[token] == max_p) break;
                token++;
                token %= n;
            }
            System.out.println(token);
        }
    }
}