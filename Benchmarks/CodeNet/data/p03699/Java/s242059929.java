import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] s = new Integer[n];
        long sum = 0;
        for(int i = 0;i < n;i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        Arrays.sort(s);
        
        long ans = 0;
        for(int i = 0;i < n;i++) {
            if(sum % 10 != 0) {
                ans = sum;
                break;
            }
            else {
                sum -= s[i];
            }
        }
        
        System.out.println(ans);
    }

}
