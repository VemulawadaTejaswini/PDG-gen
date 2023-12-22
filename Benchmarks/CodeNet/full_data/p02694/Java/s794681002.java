import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int interest = 100;
        int year = 0;
        while (interest <= n)[
            interest = interest * 1.01;
            year += 1;
            if (interest == n){
                break;
            }
        ]

        System.out.println(year);
    }
}
