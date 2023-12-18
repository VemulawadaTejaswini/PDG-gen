import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        double ans = 1;
        if(n != 1){
            if(n % 2 == 0){
                ans = 0.5;
            }else{
                ans = (n + 1)/(2 * n);
            }
        }
        System.out.println(ans);
    }
}