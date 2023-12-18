import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int[] contents = new int[S.length()+1];
        contents[0] = 0;
        getContents(S, contents);

        int sum = 0;
        for (int i = 0; i < S.length()+1; i++) {
            sum += contents[i];
        }

        System.out.println(sum);
    }
    private static void getContents(String S, int[] contents) {
        boolean ng = false;
        for (int index = 1; index <= S.length(); index ++) {
            if (S.substring(index -1, index).equals("<")) {
                if (contents[index-1] < contents[index]) {
                    continue;
                }
                contents[index] = contents[index-1] + 1;
            } else {
                if (contents[index-1] > contents[index]) {
                    continue;
                } else if (contents[index-1] == contents[index]) {
                    ng = true;
                    contents[index-1]++;
                }
                if (contents[index-1] == 0) {
                    ng = true;
                    contents[index-1] = 1;
                    contents[index] = 0;
                } else {
                    contents[index] = contents[index-1] - 1;
                }
            }
        }
        if (ng) {
            getContents(S, contents);
        }
    }
}
