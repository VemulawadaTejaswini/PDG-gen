import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double money = 100;
        int count = 0;
        while(money < x){
            money = Math.floor(money * 1.01);
            count++;
        }
        System.out.println(count);
    }
}

