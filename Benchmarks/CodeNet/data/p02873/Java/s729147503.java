
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] arr = new int[S.length() + 1];
        ArrayList<Integer> holes = new ArrayList<Integer>();
        if (S.charAt(0) == '<')
            holes.add(-1);
        for (int i = 1; i < S.length(); i++) {
            if (S.substring(i - 1, i + 1).equals("><"))
                holes.add(i - 1);
        }
        if (S.charAt(S.length() - 1) == '>')
            holes.add(S.length() - 1);
        for (int k = 0; k < holes.size(); k++) {
            int st = holes.get(k);
            for (int i = st; i >= 0; --i) {
                if (i >= 1 && S.charAt(i - 1) == '<') {
                    arr[i] = Math.max(arr[i - 1] + 1, arr[i + 1] + 1);
                    break;
                } else {
                    arr[i] = arr[i + 1] + 1;
                }
            }
            for (int i = st + 2; i < S.length(); i++) {
                arr[i] = arr[i - 1] + 1;
                if (S.charAt(i) == '>')
                    break;
            }
        }
        if (S.charAt(S.length() - 1) == '<')
            arr[S.length()] = arr[S.length() - 1] + 1;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}