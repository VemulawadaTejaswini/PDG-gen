import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int year = 0;
        double money = 100.0;
        while (money<x){
            year++;
            money=Math.floor(money*1.01d);
        }
        System.out.println(year);
    }
}