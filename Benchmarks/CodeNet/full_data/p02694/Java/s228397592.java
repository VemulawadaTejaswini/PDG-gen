import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Long X = scanner.nextLong();
        Long i = 100L;
        int count = 0;
        while(i < X){
            count += 1;
        }

        System.out.println(count);
    }
}