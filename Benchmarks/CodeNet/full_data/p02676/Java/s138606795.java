import java.util.*;
public class Main {
    public static void main(String[] args){
        int N;
        String str1;
        char str2[] = new char[103];
        char ans[] = new char[103];
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        str1 = sc.nextLine();

        str2 = str1.toCharArray();

        for (int i = 0; i < N; i++) {
            ans[i] = str2[i];
        }
        ans[N - 1] = ans[N] = ans[N + 1] = '.';

        System.out.println(ans);
    }
}