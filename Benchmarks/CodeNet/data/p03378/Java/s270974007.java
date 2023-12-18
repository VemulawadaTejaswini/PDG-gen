import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
        boolean[] a = new boolean[n+1];
        for(int i = 0;i<m;i++){
            a[sc.nextInt()]=true;
        }
        int ans0 = 0;
        int ansN = 0;
        for(int i = x;i<=n;i++){
            if(a[i]){
                ansN ++;
            }
        }
        for(int i =x;i>=0;i--){
            if(a[i]){
                ans0 ++;
            }
        }
        System.out.println(Math.min(ansN,ans0));
    }
}