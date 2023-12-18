import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        double ad = (double)a;
        double bd = (double)b;

        if (Math.floor(ad/0.08) == Math.floor(bd /0.1)){
            if (ad/0.08<25){
                System.out.println("25");
            }else {
                System.out.println(ad/0.08);
            }
        }else {
            System.out.println("-1");
        }
    }
}