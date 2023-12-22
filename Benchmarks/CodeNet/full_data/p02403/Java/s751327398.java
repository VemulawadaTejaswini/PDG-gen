import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        for(int i = 0; i < W; i++){
            for(int j = 0; j < H; j++){
                System.out.println("#");
            }
        }
    }
}