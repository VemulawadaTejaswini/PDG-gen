import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int Alice_start = sc.nextInt();
        int Alice_end =sc.nextInt();
        int Bob_start =sc.nextInt();
        int Bob_end =sc.nextInt();
        int low = Math.max(Alice_start,Bob_start);
        int upp = Math.min(Alice_end,Bob_end);
        System.out.println(Math.max(0,upp-low));
    }
}