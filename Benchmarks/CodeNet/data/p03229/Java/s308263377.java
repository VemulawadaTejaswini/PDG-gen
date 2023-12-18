import java.util.*;
//tenka 1 programmer Biginner Contest C
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++)ary[i]=sc.nextInt();
        sc.close();
        Arrays.sort(ary);
        int ans = 0;
        if(n==2){
            System.out.println(ary[1]-ary[0]);
            return;
        }
        if(n==3){
            System.out.println(ary[2]+ary[1]-ary[0]*2);
            return;
        }
        for(int i = 0;i < (n+1)/2;i++){
            ans -= ary[i]*2;
            ans += ary[n/2+i]*2;
        }
       ans -= ary[n/2]-ary[n/2-1];       
        System.out.println(ans);
    }
}