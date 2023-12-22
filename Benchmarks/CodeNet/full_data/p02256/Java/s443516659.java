import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];

        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        System.out.println(gcd(num[0],num[1]));
    }
    
    public static int gcd(int x, int y){
        int r;
        if(x < y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        while(y > 0){
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
