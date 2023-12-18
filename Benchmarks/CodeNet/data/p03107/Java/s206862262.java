import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        char c = s[0];
        int cnt = 0;
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if(s[i] != c){
                cnt++;
                idx = i+1;
            }
        }

        System.out.println(Math.min(cnt, idx-cnt) *2);
        sc.close();
    }

}
