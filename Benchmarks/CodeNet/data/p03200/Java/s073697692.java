import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int ans = 0;
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i < str.length - 1; i++) {
                if(str[i] == 'B' && str[i + 1] == 'W') {
                    str[i] = 'W';
                    str[i + 1] = 'B';
                    ans++;
                    flag = true;
                }
            }
        }
        System.out.println(ans);
    }
}