import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        int min = scan.nextInt();
        int count = 1;
        for(int i = 1; i < num; i++){
            int temp = scan.nextInt();
            if(temp >= min){
                count++;
                min = temp;
            }
        }

        // answer
        System.out.println(count);

    }
}