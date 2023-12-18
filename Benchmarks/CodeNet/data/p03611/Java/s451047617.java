import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int l,r;
        int ans = 0;
        for(int i = 0;i < n;i++)
            num[i] = sc.nextInt();
        Arrays.sort(num);
        l = num[0] - 1;
        r = num[n-1] + 1;
        
        for(int i = l;i <= r;i++){
            int tmp = 0;
            for(int j = 0;j < n;j++){
                if(i == num[j]-1 || i == num[j] || i == num[j]+1)
                    tmp++;
            }
            if(ans < tmp)
                ans = tmp;
        }

        System.out.println(ans);
    }
}