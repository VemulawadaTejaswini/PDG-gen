import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int havingMoney = 100;
        int pastYear = 0;
        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.next());

        while(true){
            havingMoney = (int) (havingMoney*1.01);
            pastYear++;
            if(havingMoney >= target){
                break;
            }
        }
        System.out.println(pastYear);
    }
}
