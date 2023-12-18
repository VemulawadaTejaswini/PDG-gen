import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextint(), B = sc.nextInt(), C = sc.nextInt();
        if (C >= A && C <= B) {
            System.out.println("Yes");
        } else if (C >= B && C <= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}