import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < words.length; i++) words[i] = in.next();

        int res = 0;
        for (int i = 0; i < N; i++) {
            int[] countI = count(words[i]);
            for (int j = i + 1; j < N; j++) {
                if (words[j].length() != words[i].length()) continue;
                int[] countJ = count(words[j]);
                if (checkAnagram(countI, countJ)) res++;
            }
        }
        System.out.println(res);
    }

    private static int[] count(String S) {
        int[] cnt = new int[26];
        for (Character c : S.toCharArray())
            cnt[(int) c - 97]++;
        return cnt;
    }

    private static boolean checkAnagram(int[] A, int[] B) {
        if (A.length != B.length) return false;
        for (int i = 0; i < A.length; i++)
            if (A[i] != B[i]) return false;
        return true;
    }

}
