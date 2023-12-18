import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > 13) {
            System.out.println(B);
        } else if (A >= 6 && A <= 12) {
            System.out.println(B / 2);
        } else if (A <= 5 && A >= 0) {
            System.out.println(0);
        }
    }
}