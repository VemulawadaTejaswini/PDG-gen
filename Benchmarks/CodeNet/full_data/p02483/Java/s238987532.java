import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[3];
        for (int i = 0; i < 3; i++){
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                if (num[j] > num[j + 1]){
                    int swap = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = swap;
                }
            }
        }
        for (int i = 0; i < 3; i++){
            System.out.print(num[i]);
            if (i <= 2){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}