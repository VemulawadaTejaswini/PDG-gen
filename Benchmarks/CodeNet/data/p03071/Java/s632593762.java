import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int input_int[] = new int[n];
        int oceanView = 0;
        int curMax = 0;
        for(int i = 0; i < n; i++){
            input_int[i] = scanner.nextInt();
            curMax = Math.max(curMax, input_int[i]);
            if(input_int[i] == curMax) oceanView++;
        }
        scanner.close();

        System.out.println(oceanView);
    }
}
