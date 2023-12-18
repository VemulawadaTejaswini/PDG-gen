import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int L0 = 2;
        int L1 = 1;
        int Lucas = L0 + L1;
        int Lucas1 = L1;
        for(int i = 0; i < N-2; i++){
            int temp = Lucas;
            Lucas = Lucas + Lucas1;
            Lucas1 = temp;
        }
        System.out.println(Lucas);
    }
}