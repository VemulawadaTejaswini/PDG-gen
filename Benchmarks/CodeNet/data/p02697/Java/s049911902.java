import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int left = 1;
        int right = m;
        for(int i = 0; i < m; i++){
            System.out.println(String.format("%d %d", left, right));
            left++;
            right--;
        }
    }
}