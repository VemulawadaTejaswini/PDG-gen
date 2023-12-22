import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r;

        while((r = x % y) != 0){
            x = y;
            y = r;
        }

        System.out.println(y);
    }
}
