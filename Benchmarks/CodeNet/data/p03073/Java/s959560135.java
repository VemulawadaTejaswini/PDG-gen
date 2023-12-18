public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Long dec = Long.parseLong(s, 2);


        Long count = 0l;
        for (int i = 0; i <= dec; i++) {
            if((dec | (1 << 1)) != 0) {
                dec /= 4;
                if (s.length() < 2) break;
                count++;
            }
        }

        System.out.println(count);
    }
}
