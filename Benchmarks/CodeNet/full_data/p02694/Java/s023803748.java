import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int i = 0;
        for(i = 100; i <= X; i++){
            i = i * 1.01;
        }

        System.out.println(i);
    }
}