import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        float y = scan.nextInt();

        float z1 = (y -2*x) / 2;
        float z2 = (4 * x - y) / 2;

        if (z1 >= 0 && z2 >= 0 && z1%1 ==0 && z2%1 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
