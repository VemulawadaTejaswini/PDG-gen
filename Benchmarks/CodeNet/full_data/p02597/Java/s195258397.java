import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int ans = 0;
        int mostLeftRed = -1;
        int mostRightRed = -1;
        int mostRightWhite = -1;
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(mostLeftRed<0 && c=='R') {
                mostLeftRed = i;
            }
            if(c=='R') {
                mostRightRed = i;
            }
            if(c=='W') {
                mostRightWhite = i;
            }
        }
        
        // 石の色反転の技は、使わなくても一緒（未証明）なので、入れ替え操作のことだけ考える。
        int rightRedIndex = mostRightRed;
        for(int i=0; i<=mostRightWhite && i<rightRedIndex; i++) {
            char c = s.charAt(i);
            if(c=='W') {
                ans++;
                // 右から赤を探してくる
                boolean updated = false;
                for(int j=rightRedIndex-1; j>=i; j--) {
                    char c2 = s.charAt(j);
                    if(c2=='R') {
                        rightRedIndex = j;
                        updated = true;
                        break;
                    }
                }
                if(!updated) {
                    // もう除くべき赤は無い
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
