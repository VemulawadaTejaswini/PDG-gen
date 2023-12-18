import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        long X = (long)scanner.nextInt();
        double i = 0;
        int count = 0;
        for(i = 100; i < X;){
            i += i/100;
            i = Math.floor(i);
            count += 1;
        }

        System.out.println(count);
    }
}