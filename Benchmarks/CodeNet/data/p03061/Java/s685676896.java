import java.util.*;

public class Main{

    public static int gcd(int a, int b){
        if (a==0) return b;
        else if (b==0) return gcd(b, a);
        else if (a%b==0) return b;
        else{
            return gcd(b, a%b);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        List<Integer> a = new ArrayList<>();
//        for (int i=0; i<n; i++) a.add(sc.nextInt());

//        for (int i=0 ;i<n; i++){
//            if (a.remove(a.get(i)))
//        }

        int ans = 0;
        int a[] = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
//        int ans_list[] = new int[n];
//        List<Integer> ans_list = new ArrayList<>();

        int answer = 0;

        int l[] = new int[n];
        int r[] = new int[n];

        l[0] = 0;
        for (int i=1; i<n-1; i++){
            l[i] = gcd(l[i-1], a[i-1]);
        }
        r[n-1] = 0;
        for (int i=n-2; i>=0; i--){
            r[i] = gcd(r[i+1], a[i+1]);
        }

        for (int i=0; i<n; i++){
            ans = Math.max(ans, gcd(l[i], r[i]));
        }

        System.out.println(ans);
//        for (int i=0; i<n; i++){
//            ans = 0;
//            int tmp = a.get(i);
//            a.remove(a.get(i));
//            for (int j= 0; j<n-1; j++){
//                ans = gcd(ans, a.get(j));
//            }
//            a.add(i, tmp);
//            if (answer<ans) answer=ans;
////            ans_list.add(ans);
//        }

//        System.out.println(ans_list);
//        System.out.println(a);
//        System.out.println(answer);

    }

}
