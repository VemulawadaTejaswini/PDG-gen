import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            int sum = 0;
            while(x > 0){
                sum += x % 10;
                x /= 10;
            }
            System.out.println(sum);
        }
    }
}
