import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int seat = sc.nextInt();
        int wid = sc.nextInt();
        int space = sc.nextInt();
        System.out.println((seat-space)/(wid+space));
    }
}
