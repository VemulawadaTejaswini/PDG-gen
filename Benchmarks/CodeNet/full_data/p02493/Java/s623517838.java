import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] numbers = new int[length];

        int i=0;
        do{
            numbers[i] = in.nextInt();
        }while(++i<length);
        while(--i=i){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(" ");
            }
            else{
                break;
            }
        }
    }
}