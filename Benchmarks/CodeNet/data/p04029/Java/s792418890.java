import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int candy = 0;
        for(int i = 1; i <= n; i++){
            candy = candy + i;
        }
        System.out.println(candy);
    }
}
