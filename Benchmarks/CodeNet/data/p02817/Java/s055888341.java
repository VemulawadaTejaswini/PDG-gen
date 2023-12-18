import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine().split(" ");
        System.out.println(inp[1] + inp[0]);
        sc.close();
    }
}