import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        inp.close();
        char ss[] = s.toCharArray();
        int N = 753;
        int ans = 1000000;
        int r = 0;
        for (int i = 0; i < ss.length - 2; i++) {
            r = sum(slice(ss, i, i+3));
            r = Math.abs(r - 753);
            if (r < ans) {
                ans = r;
            }
        }
        System.out.println(ans);
    }
    public static char[] slice(char arr[], int from, int to) {
        char res[] = new char[to - from + 1];
        int count = 0;
        for (int i = from; i < to; i++) {
            res[count] = arr[i];
            count++;
        }
        return res;
    }
    public static int sum(char arr[]) {
        String s = String.valueOf(arr).trim();
        int ans = Integer.parseInt(s);
        return ans;
    }
}