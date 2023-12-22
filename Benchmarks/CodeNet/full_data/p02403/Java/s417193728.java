import java.util.Scanner;
import java.lang.System;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        if(H == 0 && W == 0) System.exit(0);

        for(int i = 0 ; i < H ; i++){
            for(int j = 0 ; j < W ; j++){
                System.out.printf("#");
            }
            System.out.println();
        }
    }
}
