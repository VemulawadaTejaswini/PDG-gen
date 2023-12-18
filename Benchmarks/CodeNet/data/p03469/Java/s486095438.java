import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ymd = sc.next();
        System.out.println("2018" +  ymd.substring(4,10));   
    }
}