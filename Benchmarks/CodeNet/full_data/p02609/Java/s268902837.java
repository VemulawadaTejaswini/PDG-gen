import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.next();
        long dec = Long.parseLong(x, 2);
        for(int i=1;i<=n;i++) {
            System.out.println(fc(dec ^ (1 << (n-i))));
        }
    }

    public static int popc(long a) {
        int ans = 1;
        while(a>1) {
            ans += a%2;
            a /= 2;
        }
        return ans;
    }

    public static int fc(long a) {
        int ans = 0;
        while(a>0) {
            ans ++;
            a %= popc(a);
        }
        return ans;
    }

}

        // int sq = 0;
// for (int a=1;a<=n;a++) {
//     long ans = 0;
//     sq = (int)Math.sqrt(n) + 1;
//     // 配列
//     for(int x=1;x<=sq;x++){
//         for(int y=x;x+y<=sq;y++){
//             for(int z=y;x+y+z<=sq;z++){
//                 if(x*(x+y+z) + y*(y+z) + z*z == a) {
//                     if(x!=y && x!=z && y!=z) {
//                         ans+=6;
//                     } else if(x==y && x==z) {
//                         ans++;
//                     } else {
//                         ans+=3;
//                     }
//                 }
//             }
//         }
//     }
//     System.out.println(ans);
// }
