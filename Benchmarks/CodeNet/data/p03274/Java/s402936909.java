import java.util.*;

class Main{

    static final int DIV = 100000007;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] ary = new long[n];
        long[] div = new long[n];
        ary[0] = sc.nextLong();
        div[0] = ary[0]>0?ary[0]:ary[0]*-1;
        for(int i = 1;i<n;i++){
            ary[i] = sc.nextLong();
            div[i] = ary[i] - ary[i-1];
        }
        long ans = DIV;
        for(int i = 0;i < n-k+1;i++){
            long sum = 0;
            for(int j = i;j<k+i-1;j++){
                sum += div[j];
            }
            if(ary[i]<0){
                sum-=ary[i];
            }else{
                sum+=ary[i];
            }
            if(sum < ans)ans = sum;
        }
        System.out.println(ans);
    }
}