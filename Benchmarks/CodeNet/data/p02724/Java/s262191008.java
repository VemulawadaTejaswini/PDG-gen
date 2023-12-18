import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int glad = 0;
        if(x/500!=0){
            glad = x/500 * 1000;
            x = x%500;
        }
        if(x/5!=0){
            glad = glad + (x/5 * 5);
            x = x%500;
        }
        System.out.println(glad);
    }
}
