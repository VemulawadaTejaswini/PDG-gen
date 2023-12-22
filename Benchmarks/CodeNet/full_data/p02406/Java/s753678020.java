
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i= 1;
        while (i <= n) {
            int x=i;
            if (x % 3 == 0 ||x % 10 == 3) {
                System.out.printf(" %d", x);
            }else{
                while (true) {
                    if (x / 10 == 3) {
                        System.out.printf(" %d", x);
                    }
                    x = x / 10;
                    if (x == 0) {
                        break;
                    }
                }
            }
            i++;
        }
        System.out.println();
    }
}


