import java.util.Scanner;

public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        int x = scan.nextInt();
        int y = scan.nextInt();
        int luas = x *y;
        int keliling = 2*(x+y);
        System.out.printf("%d %d\n",luas,keliling);
    }
}
