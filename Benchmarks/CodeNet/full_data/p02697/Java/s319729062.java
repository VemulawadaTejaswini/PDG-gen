import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int laterIndex = n/2;
        if(n % 2 == 1){
            for(int i = 1, r = n-1; i < r; i++, r--){
                System.out.println(i + " " + r);
            }
        }else{
            boolean flug = false;
            for(int i = 1, r = n - 1; i < r; i++, r--){
                if(!flug && r-1 <= n/2){
                    --r;
                    flug = true;
                }
                System.out.println(i + " " + r);
            }
        }
    }
}
