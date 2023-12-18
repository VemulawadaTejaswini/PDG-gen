import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        double i = 0;
        int count = 0;
        for(i = 100; i <= X; i * 1.01){
            count += 1;
        }

        System.out.println(count);
    }
}