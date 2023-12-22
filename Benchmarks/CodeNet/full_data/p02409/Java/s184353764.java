import java.util.HashMap;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // number of residents
        int[][] house = new int[12][10];
        for(int i = 0; i < number; i++){
            int b = input.nextInt();
            b = (b - 1) * 3; // Change b into a 3 based
            int f = input.nextInt();
            int r = input.nextInt();
            int v = input.nextInt();
            house[b+f-1][r-1] += v;
        }
        display(house);
    }
     public static void display(int[][] house){
        for(int i = 0; i < 12; i++){
            if(i%3==0 && i != 0){
                System.out.println("####################");
            }
            for(int j = 0; j < 10; j++){
                System.out.print(" " + house[i][j]);
            }
            
                System.out.print("\n");
        }
    }
}
