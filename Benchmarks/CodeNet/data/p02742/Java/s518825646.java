import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        if (W == 1 && H == 1){
            System.out.println(0);
        }
        else if(W*H % 2 == 0) {
            long K = ((long)H*(long)W / 2);
            System.out.println(K);
        }
        else if (W*H % 2 != 0){
            long K = ((long)H*(long)W / 2 + 1) ;
            System.out.println(K);
        }


    }
}