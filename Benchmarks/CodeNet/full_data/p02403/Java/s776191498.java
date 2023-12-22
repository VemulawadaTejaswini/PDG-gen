import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        for ( int i = 0; i < W; i++ ){
            if ( W == 0 ) break;
            for ( int j = 0; j < H; j++ ){
                if ( H == 0 ) break;
                System.out.print("#");		       
            }
        System.out.println("");		       
        }
    }
}
