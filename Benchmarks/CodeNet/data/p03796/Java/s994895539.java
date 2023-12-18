import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tra = sc.nextInt();
        int pow = 1;

        for(int i = 1;i <= tra;i++){
            pow *= i;
        }
        int ans = pow % 1000000007;
        System.out.println(ans);
    }
}