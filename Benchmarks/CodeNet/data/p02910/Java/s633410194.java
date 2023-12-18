import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "Yes";
        char[] s = sc.next().toCharArray();
        for(int i = 0; i < s.length; i++) {
            if((i % 2 == 0 && s[i] == 'L') || (i % 2 == 1 && s[i] == 'R')) result = "No";
        }
        System.out.println(result);
    }
}
