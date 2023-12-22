public class Main {

    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println(HPB(num));
    }

    static public String HPB(int number) {
        // "pon"パターン
        int[] ponNumber = {0, 1, 6, 8};

        // 1の位が3なら"bon"
        if (number % 10 == 3)
            return "bon";

        // 1の位が"pon"パターンに当てはまるか
        for (int ponInt : ponNumber) {
            if (number % 10 == ponInt)
                return "pon";
        }

        // "bon"でも"pon"でもないものは"hon"パターン
        return "hon";
    }
}
