

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;
        for (int i = 0 ; i < N ; i++) {
            int count = 0;

            String X = S.substring(0, i + 1);
            String Y = S.substring(i, N);
            Set<String> setX = new HashSet<>();
            for (int j = 0; j < X.length(); j++) {
                setX.add(String.valueOf(X.charAt(j)));
            }
            Set<String> setY= new HashSet<>();
            for (int k = 0; k < Y.length(); k++) {
                setY.add(String.valueOf(Y.charAt(k)));
            }
            Iterator<String> iterator = setY.iterator();
            while (iterator.hasNext()) {
                if (setX.contains(iterator.next())) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
