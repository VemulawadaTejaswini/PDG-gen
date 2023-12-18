import java.util.*;

class Main{
    //149e
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(ary);
        int qm = (int)(Math.sqrt(m))+ 1;
        int[] a = new int[qm*qm];
        for(int i = 0;i < qm;i++){
            for(int j = 0;j < qm;j++){
                a[qm*i+j] = ary[n-i-1] + ary[n-j-1];
            }
        }
        Arrays.sort(a);
        long ans = 0;
        int count = 0;
        for(int i = a.length-1;i >= 0;i--){
            if(count==m)break;
            ans += a[i];
            count++;
        }
        System.out.println(ans);
    }
    
}