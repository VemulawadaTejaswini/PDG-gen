import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int m = scan.nextInt();
            int f = scan.nextInt();
            int r = scan.nextInt();
            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if (m == -1 || f == -1) {
                sb.append("F").append("\n");
            } else if(m + f >= 80) {
                sb.append("A").append("\n");
            } else if (m + f >= 65) {
                sb.append("B").append("\n");
            } else if (m + f >= 50) {
                sb.append("C").append("\n");
            } else if (m + f >= 30) {
                if (r >= 50) {
                    sb.append("C").append("\n");
                } else {
                    sb.append("D").append("\n");
                }
            } else {
                sb.append("F").append("\n");
            }
        }
        System.out.print(sb);
    }
}