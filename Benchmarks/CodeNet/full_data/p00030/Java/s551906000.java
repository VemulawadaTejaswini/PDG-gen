import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=1,x=1;
        while(n != 0 || x != 0){
            n = sc.nextInt();
            x = sc.nextInt();
            if(n == 0 && x == 0) break;
            int count = 0;
            for (int i=0; i<(Math.pow(2,10)); i++) {
                int cnt = 0,cn = 0;;
                for (int j=0; j<10; j++) {
                    if ((1&i>>j) == 1){
                        cnt += j;
                        cn++;
                    }
                }
                if(cnt == x && cn == n){
                    count++;
                }
                
            }
        System.out.println(count);
        }
        
        sc.close();
    }
}

