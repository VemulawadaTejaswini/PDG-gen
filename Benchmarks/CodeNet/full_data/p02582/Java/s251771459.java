import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        sc.close();

        int cnt = 0;
        for(char c: s) {
            if(c == 'R') cnt++;
        }
        if(cnt == 2 && s[1] == 'S') cnt = 1;
        System.out.println(cnt);
    }
}
