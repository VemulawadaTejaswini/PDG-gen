import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count, n, x, i, j, k;
        while(true){
            count = 0;
            n = scan.nextInt();
            x = scan.nextInt();
            if(n == 0 && x ==0) break;
            for(i = 1; i <= n; i++){
                for(j = i + 1; j <= n; j++){
                    for(k = j + 1; k <= n; k++){
                        if(i != j && i != k && j != k){
                        	if(x == i + j + k) count++;
                        }
                    }
                }
            }
            System.out.printf("%d\n", count);
        }
        scan.close();
    }
}

