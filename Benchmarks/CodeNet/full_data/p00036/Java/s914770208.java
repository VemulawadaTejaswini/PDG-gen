import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] check = new int[4][4];
        for (int i = 0; i < 4; i++) {
            check[i] = IntStream.rangeClosed(i * 4 + 1, i * 4 + 4).toArray();
        }
        while (sc.hasNext()) {
            int offsetX = 0;
            int offsetY = 0;
            int sum = 0;
            for (int i = 0; i < 8; i++) {
                String text = sc.next();
                for (int j = 0; j < 8; j++) {
                    if (text.charAt(j) == '1') {
                        if (sum == 0) {
                            offsetX = j;
                            offsetY = i;
                            sum++;
                        } else {
                            int dx = j - offsetX;
                            int dy = i - offsetY;
                            if (dx >= 0) {
                                sum += check[dy][dx];
                            }
                        }
                    }
                }
            }
            char answer = 0;
            switch (sum) {
            case 14:
                answer = 'A';
                break;
            case 28:
                answer = 'B';
                break;
            case 10:
                answer = 'C';
                break;
            case 6:
                answer = 'D';
                break;
            case 16:
                answer = 'E';
                break;
            case 22:
                answer = 'F';
                break;
            case 8:
                answer = 'G';
                break;
            }
            System.out.println(answer);
        }
    }
}
