import java.io.BufferedInputStream;
        import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void solve(){
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        String[] str = sc.nextLine().split(" ");
        if (str[0].charAt(str[0].length()-1) == str[1].charAt(0) &&
                str[1].charAt(str[1].length()-1) ==
                        str[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    public static int gcd(int a, int b){
        return b==0 ? a : gcd(b, a % b);
    }

    public static void solve2(){
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c % gcd(a,b)==0){

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    public static void solve3(){
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        int a[][] = new int[n+1][28];

        for(int i =0 ; i < n ;i ++) {
            String str = sc.next();
            int b[] = new int[28];
            for (int j =0 ;j<str.length(); j++) {
                b[str.charAt(j)-'a']++;
            }
            a[i] = b;
        }
        StringBuffer str = new StringBuffer();
        for(int i = 0 ; i < 26 ; i ++ ){
            int mx=Integer.MAX_VALUE;
            for(int j = 0; j < n ; j++) {
                mx = Math.min(mx, a[j][i]);
            }
            if (mx!=0) {
                for (int k = 0; k < mx; k++)
                    str.append((char)(i + 'a'));
            }
        }
        System.out.println(str.toString());

    }
    public static void main(String[] argc) {
        solve3();
    }
}
