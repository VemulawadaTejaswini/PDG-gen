import java.util.Scanner;
import java.util.Arrays; 

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}