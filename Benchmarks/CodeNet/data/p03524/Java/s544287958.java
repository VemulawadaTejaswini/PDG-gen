import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "YES";
        int[] C = new int[3];
        char[] S = sc.next().toCharArray();
        for(char ch : S) C[ch - 'a']++;
        if(S.length < 3) {
            for(int a : C) if(a > 1) res = "NO";
        }
        else if(S.length % 3 == 0) {
            if(C[0] != C[1] || C[1] != C[2]) res = "NO";
        } else if(S.length % 2 == 1) {
            for(int a : C) if(a < S.length / 3 || a > S.length / 3 + 1) res = "NO";
        } else {
            for(int a : C) if(a < S.length / 3 - 1 || a > S.length / 3) res = "NO";
        }
        System.out.println(res);
    }
}
