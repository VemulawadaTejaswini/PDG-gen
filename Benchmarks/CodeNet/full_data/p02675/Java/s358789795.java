import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n % 10) {
            case 2,4,5,7,9:
                System.out.println("hon");
                return;
            case 0,1,6,8:
                System.out.println("pon");
                return;
            case 3:
                System.out.println("bon");
                return;
        }
    }
}

