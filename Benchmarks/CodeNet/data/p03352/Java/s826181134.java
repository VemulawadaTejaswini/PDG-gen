import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int max = 0;
        int ans = 0;
        while(x >= max){
            ans++;
            max = ans*ans;
        }
        System.out.println((ans-1)*(ans-1));
    }
}
