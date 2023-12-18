import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r,g,b;
        r = sc.nextInt();   
        g = sc.nextInt();   
        b = sc.nextInt();   

        System.out.println((r*100 + g*10 + b*1)%4 == 0 ? "Yes" : "No");
    }
}