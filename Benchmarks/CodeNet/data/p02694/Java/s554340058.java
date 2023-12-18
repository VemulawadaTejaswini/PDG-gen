import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        long havingMoney = 100;
        long pastYear = 0;
        Scanner sc = new Scanner(System.in);
        long target = Long.parseLong(sc.next());

        while(havingMoney < target){
            havingMoney = (long) (havingMoney*1.01);
            pastYear++;
        }
        System.out.println(pastYear);
    }
}
