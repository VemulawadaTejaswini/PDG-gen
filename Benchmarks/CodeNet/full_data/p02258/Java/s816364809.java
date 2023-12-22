import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int max = -1000000000;
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
            for(int j = 0; j < i; j++){
                int now = x[i] - x[j];
                if(now > max){
                    max = now;
                }
            }
        }
        System.out.println(max);
    }
}
