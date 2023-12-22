import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            int n = scan.nextInt();
            int x = scan.nextInt();

            if (n == 0 && x == 0) {
                break;
            }
            for (int i = 1;i < n;i++) {
                for (int j = i; j < n;j++) {
                    if(i == j) {
                        continue;
                    }
                    int num = x - (i + j);
                    if (num < j) {
                        break;
                    }
                    if (num < 1) {
                        break;
                    }
                    if(i != num && j != num && num <= n) {
                        count++;
                    }
                    num = 0;
                }
            }
        }
        System.out.println(count);
    }
}