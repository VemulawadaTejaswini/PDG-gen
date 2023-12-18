import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] nums = new int[num];
        for(int i = 0; i < num; i++){
            nums[i] = sc.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < num; i++){
            //i番目以外の公約数
            int gcd = nums[(i+1)%num];
            for(int j = 0; j < num; j++){
                if(j != i)gcd = gcd(gcd, nums[j]);
            }
            if(gcd > ans)ans = gcd;
        }

        System.out.println(ans);

    }

    static int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a % b);
    }
}