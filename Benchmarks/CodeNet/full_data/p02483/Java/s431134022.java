import java.util.Scanner;
import java.util.Arrays; 

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];

        for(int i = 0; i < 3; i++){
            num[i] = scan.nextInt();
        }

        Arrays.sort(num);

        for(int i = 0; i < 3; i++){
            System.out.print(num[i]);
            if (i < 2){
                System.out.print(" ");
            } else {
                System.out.print("\n");
            }
        }
    }
}