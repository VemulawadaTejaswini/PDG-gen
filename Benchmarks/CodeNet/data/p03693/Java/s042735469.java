import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.println((s % 100) % 4 == 0 ? "YES" : "NO");
    }
}
