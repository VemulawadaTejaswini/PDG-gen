import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        String[] s = new String[n];
        String temp, rep;
        for (int i = 0; i < n; i++) {
            temp = sc.next();
            while (true) {
                rep = temp.replaceAll("\\(\\)", "");
                if (rep.equals(temp)) {
                    break;
                }
                temp = rep;
            }
            s[i] = rep;
        }

        Arrays.sort(s);

        temp = String.join("", s);

        while (true) {
            rep = temp.replaceAll("\\(\\)", "");
            if (rep.equals(temp)) {
                break;
            }
            temp = rep;
        }
        if (temp.equals("")) {
            // 出力
            System.out.println("Yes");
        } else {
            // 出力
            System.out.println("No");
        }
    }
}
