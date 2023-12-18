import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] v = {'A', 'B', 'C'};
        int ct = 0;
        for (int i = 0; i < s.length; i++) {
            int j = 0;
            for (; j < v.length; j++) {
                if (s[i + j] != v[j]) break;
            }
            if (j >= v.length) ct++;
        }
        System.out.println(ct);
    }
}