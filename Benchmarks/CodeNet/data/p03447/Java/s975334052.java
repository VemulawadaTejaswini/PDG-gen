import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int money = s.nextInt();
        int cake = s.nextInt();
        int donut = s.nextInt();

        int rest = (money - cake) % donut;
        System.out.println(rest);
    }
}