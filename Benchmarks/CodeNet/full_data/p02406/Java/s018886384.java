import java.util.Scanner

class Main{
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            } else if (i % 10 == 3) {
                System.out.print(" " + i);
            }
        }
    }
}