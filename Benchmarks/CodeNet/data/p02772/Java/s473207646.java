import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a%2 == 0){
                if(a%3 != 0 && a%5 != 0){
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans ? "APPROVED" : "DENIED");
        sc.close();

    }

}
