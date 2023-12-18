import java.util.*;

public class Main {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i <N ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        if(N%2==0){
//            long ans1 =0;
//            for (int i = 0; i < N ; i=i+2) {
//                ans1+=arr[i];
//            }
//            long ans2 =0;
//            for (int i = 1; i < N ; i=i+2) {
//                ans2+=arr[i];
//            }
//            System.out.println(Math.max(ans1,ans2));
//
//        }else{
//
//            long ans = Integer.MIN_VALUE;
//            for (int j = 0; j < N; j++) {
//
//                long ans1 =0;
//                for (int i = 0; i < N ; i=i+2) {
//                    if(i==j){
//                        i++;
//                        if(i>=N) break;
//                    }
//                    ans1+=arr[i];
//                }
//                long ans2 =0;
//                for (int i = 1; i < N ; i=i+2) {
//                    if(i==j){
//                        i++;
//                        if(i>=N) break;
//                    }
//                    ans2+=arr[i];
//                }
//
//                ans = Math.max(ans,Math.max(ans1,ans2));
//
//            }
//            System.out.println(ans);
//
//        }
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int r =0,g =0,b =0;
        for (int i = 0; i < S.length(); i++) {
            char  c = S.charAt(i);
            if(c=='R'){
                r++;
            }else if (c=='G'){
                g++;
            }else{
                b++;
            }
        }
        int ans = r*g*b;
        int minus =0;
        for (int i=0; i<S.length(); ++i) {
            for (int j = i+1; j < S.length(); ++j) {

                if(S.charAt(i)==S.charAt(j)) continue ;

                int k = j+j-i;

                if(k>=N || S.charAt(k)==S.charAt(i) || S.charAt(k)==S.charAt(j) ) continue;

                minus++;

            }
        }
        System.out.println(ans-minus);
    }
//
//    static int gcd(int a, int b ){
//        if (a == 0)
//            return b;
//
//        return gcd(b%a, a);
//    }

}
