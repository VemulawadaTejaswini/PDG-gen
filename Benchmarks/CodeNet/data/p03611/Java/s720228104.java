import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[100001];
        int ans = 0;
        
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            if(a != 0)
                num[a-1]++;
            num[a]++;
            num[a+1]++;
        }
        
        for(int i:num)
            ans = Math.max(ans,i);

        System.out.println(ans);
    }
}