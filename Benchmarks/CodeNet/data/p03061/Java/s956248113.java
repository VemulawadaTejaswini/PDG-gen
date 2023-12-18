import java.util.*;

class Main{
    static int N = 100000;
    static int[] L = new int[N];
    static int[] R = new int[N];
    static int num;
    static int[] nums = new int[N];

    static int left(int i){
        if(L[i] != -1)return L[i];
        if(i == 0){
            L[i] = 0;
            return 0;
        }
        L[i] = gcd(nums[i-1], left(i-1));
        return L[i];
    }
    static int right(int i){
        if(R[i] != -1)return R[i];
        if(i == num-1){
            R[i] = 0;
            return 0;
        }
        R[i] = gcd(nums[i+1], right(i+1));
        return R[i];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i = 0; i < num; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i <= num; i++){
            L[i] = -1;
            R[i] = -1;
        }

        int ans = 0;
        for(int i = 0; i < num; i++){
            //i番目以外の公約数
            int gcd = gcd(left(i),right(i));
            if(gcd > ans)ans = gcd;
        }

        System.out.println(ans);

    }

    static int gcd(int a, int b){
        if(b == 0)return a;
        if(a == 0)return b;
        return gcd(b, a % b);
    }
}