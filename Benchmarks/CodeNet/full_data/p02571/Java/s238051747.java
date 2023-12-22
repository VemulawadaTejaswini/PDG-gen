import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < ss.length - ts.length; i++) {
            int count  = 0;
            for (int j = 0; j < ts.length; j++) {
                if(ss[i + j] != ts[j]){
                    count++;
                }
            }
            ans = Math.min(ans,count);
        }
        System.out.println(ans);
    }
}
