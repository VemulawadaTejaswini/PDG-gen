import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n % 2 == 1){
            for(int i = 1, r = n; i < r && m > 0; i++, r--){
                System.out.println(i + " " + r);
                m--;
            }
        }else{
            boolean flug = false;
            for(int i = 1, r = n; i < r && m > 0; i++, r--){
                if(!flug && r-2 <= n/2){
                    r--;
                    flug = true;
                }
                System.out.println(i + " " + r);
                m--;
            }
        }
    }
}
