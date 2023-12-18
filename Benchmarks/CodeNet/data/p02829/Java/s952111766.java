import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A;
        A = input.nextInt();
        int B = input.nextInt();
        if (A==1 && B==2)
        System.out.print(3);
        else  if (A==2 && B==3) {
            System.out.println(1);
        } else  if (A==3 && B==2) {
            System.out.println(1);
        } else  if (A==2 && B==1) {
            System.out.println(3);
        } else  if (A==1 && B==3) {
            System.out.println(2);
        } else  if (A==3 && B==1)
            System.out.println(2);
    }
}
