import java.util.*;
public class Main {
    public static int ans(int val){
        int count = 0;
        while(val > 1){
            if(val % 100 == 0){
                count++;
                val /= 100;
            } else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            if(ans(i) == d){
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }
}