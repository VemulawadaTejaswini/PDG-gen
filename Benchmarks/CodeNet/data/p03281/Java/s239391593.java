import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        if(N >= 195){
            ans = 3;
        }else if(N >= 165){
            ans = 2;
        }else if(N >= 105){
            ans = 1;
        }
        System.out.println(ans);
    }
}
