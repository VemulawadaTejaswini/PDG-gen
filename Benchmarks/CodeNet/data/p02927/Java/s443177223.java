import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int d = input.nextInt();
        int ans = 0;
        for (int i = 2; i < m+1; i++){
            for (int j = 11; j < d+1; j++){
                int a = j/10;
                int b = j%10;
                if (i == a*b && a >= 2 && b >= 2){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}