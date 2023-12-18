import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int L0 = 2;
        int L1 = 1;
        long Lucas = L0 + L1;
        long Lucas1 = L1;
        for(int i = 2; i < N; i++){
            long temp = Lucas;
            Lucas = Lucas + Lucas1;
            Lucas1 = temp;
        }
        System.out.println(Lucas);
    }
}