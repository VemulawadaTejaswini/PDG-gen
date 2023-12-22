import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        long X = (long)scanner.nextInt();
        int i = 0;
        int count = 0;
        for(i = 100; i <= X;){
            i += i/100;
            count += 1;
        }

        System.out.println(count);
    }
}