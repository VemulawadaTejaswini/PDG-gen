import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int ans = 0;

        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0;i < n-2;i++){
            if((num[i] < num[i+1] && num[i+1] < num[i+2])||((num[i] > num[i+1] && num[i+1] > num[i+2]))){
                ans++;
            }
        }

        System.out.println(ans);
    }
}