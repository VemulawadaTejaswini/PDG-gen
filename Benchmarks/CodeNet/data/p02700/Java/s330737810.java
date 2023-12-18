import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        String judge = "No";
        while(true){
            c = c - b;
            if (c <= 0) {
                judge = "Yes";
                break;
            }
            a = a - d;
            if (a <= 0) {
                break;
            }
        }
        System.out.println(judge);
    }
}
