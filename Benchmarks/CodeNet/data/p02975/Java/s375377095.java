import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int pre = 0, next = 0;
        String sPre = "", sNext = "";
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pre = n - 1;
                next = i + 1;
            } else if (i == n - 1) {
                pre = i - 1;
                next = 0;
            } else {
                pre = i - 1;
                next = i + 1;
            }

            sPre = getStringBinary(array[pre]);
            sNext = getStringBinary(array[next]);
            if (array[i] != getXOR(sPre, sNext)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static String getStringBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remain = num % 2;
            sb.insert(0, remain);
            num = num / 2;
        }
        return sb.toString();
    }

    public static int getXOR(String pre, String next) {
        int lPre = pre.length();
        int lNext = next.length();
        StringBuilder sb = new StringBuilder();

        String sub = "";

        if (lPre != lNext) {
            if (lPre > lNext) {
                sub = pre.substring(0, lPre - lNext);
                pre = pre.substring(lPre - lNext);

            } else {
                sub = next.substring(0, lNext - lPre);
                next = next.substring(lNext - lPre);

            }

            for (int i = 0; i < sub.length(); i++) {
                sb.append(sub.charAt(i));
            }
        }

        for (int i = 0; i < pre.length(); i++) {
            if ((pre.charAt(i) == '1' && next.charAt(i) != '1') || (pre.charAt(i) != '1' && next.charAt(i) == '1')) {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        String result = sb.toString();
        int l = result.length();

        int out = 0;
        for (int i = 0, j = l - 1; i < l; i++, j--) {
            if(result.charAt(i) == '1'){
                out += Math.pow(2,j);
            }else{
                out += 0;
            }
        }

        return out;
    }
}
