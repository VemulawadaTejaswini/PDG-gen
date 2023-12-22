import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        for(int i = 1; i <= H; i++){
            System.out.print("#");
            for(int j = 1; j < W; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}