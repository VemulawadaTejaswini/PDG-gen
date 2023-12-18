import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Integer[] count = new Integer[q];
        for (int i = 0; i < q; i++) {
            count[i] = 0;
            String target = s.substring(l[i] - 1, r[i]);
            int index = target.indexOf("AC");
            while(0 <= index) {
                count[i]++;
                target = target.substring(index + 1);
                index = target.indexOf("AC");
            }
        }

        String result = "";
        for (int i = 0; i < count.length; i++) {
            result += i == count.length - 1 ? count[i] : count[i] + "\r\n";
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
