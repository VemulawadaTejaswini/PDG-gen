import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        for(int i = 1;i <= k;i++){
            if(i <= a)
                ans += 1;
            if(a < i && i <= a+b)
                ans += 0;
            
            if(a+b < i && i <= a+b+c)
                ans -= 1;
        }
            
        
        System.out.println(ans);
    }
}