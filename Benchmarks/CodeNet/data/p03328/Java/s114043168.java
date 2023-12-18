import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sa = b-a;
        int ans = 0;
        
        for(int i=sa; i>0; i--){
            ans += i;
        }
        
		System.out.println(ans-b);
    }
}
