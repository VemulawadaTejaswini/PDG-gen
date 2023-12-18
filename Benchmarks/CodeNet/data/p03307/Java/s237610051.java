import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num % 2 != 0)
            System.out.println(num * 2);
        else
            System.out.println(num);
    }
}