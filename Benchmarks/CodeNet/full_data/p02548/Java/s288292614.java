import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 1;
        for (int i = 3; i <= n; i++) {
            ans += getProductCount(i - 1);
        }
        System.out.println(ans);
	}
    static int getProductCount(int n) {
        int count = 2;
        int end = (int) Math.sqrt(n);
        for(int i = 2; i <= end; i++){
            if (n % i == 0) {
                if (i == end && end * end == n) {
                    count++;
                } else {
                    count+=2;
                }
            }
        }
        return count;
    }

}