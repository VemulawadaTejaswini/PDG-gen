import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print((double)W*H/2);
        System.out.print(" ");
        if(W%2==0&&H%2==0 && x == W/2 && y == H/2){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

    }

}
