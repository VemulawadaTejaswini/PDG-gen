import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y, z, num;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        num = (x - z) / (y + z);
        System.out.println(num);
    }
    
}