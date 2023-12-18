import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    int result = execute(sc.nextInt());
        System.out.println(result);
    }

    public static int execute(int amount){
        int count500 = amount / 500;
        amount = amount % 500;
        int happy500 = count500 * 1000;
        int count5 = amount / 5;
        int happy5 = count5 * 5;
        return happy500 + happy5;
    }

}
