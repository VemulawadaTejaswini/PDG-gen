import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[][] s = new char[N][10];
        Map<String, Integer> hoge = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            scanner.next().getChars(0, 10, s[i], 0);
            Arrays.sort(s[i]);
//            list.add(i, String.valueOf(s[i]));
            String fuga = String.valueOf(s[i]);
            if (hoge.containsKey(fuga)) {
                hoge.put(fuga, hoge.get(fuga) + 1);
            } else {
                hoge.put(fuga, 1);
            }

        }
        int count = 0;
        for (String key : hoge.keySet()) {
            Integer p = hoge.get(key);
            if (p > 2) {
                Integer tmp = calcNumOfCombination(p, 2);
                count += tmp;
            }
        }

        System.out.println(count);
    }

    //組み合わせの数nCrを計算
    int calcNumOfCombination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    //nの階乗を計算
    int factorial(int n) {
        int answer = 1;
        while (n > 1) {
            answer *= n;
            n--;
        }
        return answer;
    }
}
