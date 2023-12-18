import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] cs = S.toCharArray();
        int ans = 0;
        int l = S.length();
//        if (l % 2 == 0) {
            for(int i=0;i<l/2;i++){
                if(cs[i] != cs[l-1-i]){
                    ans++;
                }
            }
//        }
//        else {
//            for(int i=0;i<l/2;i++){
//                if(cs[i] != cs[l-1-i]){
//                    ans++;
//                }
//            }
//        }
        System.out.println(ans);
    }
}