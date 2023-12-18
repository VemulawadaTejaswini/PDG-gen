import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int havingMoney = 100;
        int pastYear = 0;
        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.next());

        while(havingMoney < target){
            havingMoney = (int) (havingMoney*1.01);
            pastYear++;
        }
        System.out.println(pastYear);
    }
}
