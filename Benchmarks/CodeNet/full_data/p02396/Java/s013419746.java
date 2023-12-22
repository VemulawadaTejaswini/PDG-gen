import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        int num, i=1;
        Scanner sc = new Scanner(System.in);
        while(true) {
            num = sc.nextInt();
            if (num == 0) break;
            System.out.println("Case " + i + ": " + num);
            i++;
        }
    }
}
