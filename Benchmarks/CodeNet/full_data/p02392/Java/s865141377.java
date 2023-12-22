import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String r = "";
        if(a < b && b < c) {
            r = "Yes";
        }
        else {
            r = "No";
        }
        System.out.println(r);

        sc.close();
    }
}
