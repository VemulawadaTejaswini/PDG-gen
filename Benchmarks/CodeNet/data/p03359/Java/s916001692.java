import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt(); // 材料の種類数
        int date = sc.nextInt(); // 材料の総量


        System.out.println(calc(month,date));
    }

    public static int calc(int month, int date) {

        if (month > date) {
            return month - 1;
        } else {
            return month;
        }

    }
}
