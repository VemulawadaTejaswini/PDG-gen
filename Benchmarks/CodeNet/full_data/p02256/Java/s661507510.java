import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;

        do{
            z = x%y;
            x = y;
            y = z;

        }while(z != 0);

        System.out.println(x);

        sc.close();
    }
}
