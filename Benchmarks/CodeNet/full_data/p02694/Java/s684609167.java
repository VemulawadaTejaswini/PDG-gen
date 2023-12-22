import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var x = Long.parseLong(scaner.nextLine());

        var deposit = 100l;
        var interest = 0.01;
        
        int year = 0;
        while(deposit < x) {
            deposit += deposit*interest;
            year++;
        }
        System.out.println(year);
    }
}