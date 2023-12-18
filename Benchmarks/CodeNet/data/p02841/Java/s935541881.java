import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int currentMonth = sc.nextInt();
        int currentDay = sc.nextInt();
        int nextMonth = sc.nextInt();
        int nextDay = sc.nextInt();

        if(currentMonth != nextMonth) {
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}