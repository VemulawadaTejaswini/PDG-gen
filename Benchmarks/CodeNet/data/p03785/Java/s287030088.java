import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] T = new int[n];
        for(int i=0;i<n;i++) T[i]=sc.nextInt();
        Arrays.sort(T);
        int left = 0;
        int ans=0;
        while(left<n){
            int right = left;
            while(right<n&&T[right]-T[left]<k&&right-left+1<=c) right++;
            ans++;
            left=right;
        }
        System.out.println(ans);
    }
}
