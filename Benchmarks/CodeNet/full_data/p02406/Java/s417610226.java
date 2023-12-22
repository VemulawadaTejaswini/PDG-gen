import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int number = scan.nextInt();
        int x = 1;
        int y = 0;
        if (number >= 3 && number <= 10000) {
            for (int count = 0;count < number; count++) {
                y = x/10;
                if (x % 3 == 0){
                    sb.append(" ")
                        .append(x);
                } else {
                    while(y != 0) {
                        if (y % 10 == 3) {
                            sb.append(" ")
                                .append(x);
                            break;
                        }
                        y /= 10;
                    }
                }
                x++;
            }
            System.out.print(sb);
        }
    }
}