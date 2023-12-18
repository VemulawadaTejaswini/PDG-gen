import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int k = sc.nextInt();
        
        char hoge = s[k-1];
        for (int i = 0; i < n; i++) {
            if (s[i] == hoge)
                sb.append(s[i]);
            else
                sb.append('*');
        }
        
        System.out.println(sb.toString());
    }
}
