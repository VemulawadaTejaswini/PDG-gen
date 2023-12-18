import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sa = b-a;
        int ans = 0;
        
        for(int i = 1;i <= sa;i++)
        ans += i;

        System.out.println(ans-b);

    } 
}