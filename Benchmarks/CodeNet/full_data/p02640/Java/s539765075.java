import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

         if(X * 4 < Y || Y < 6){
             System.out.println("No");
             return;
         }
        int sum = 0;
        for (int i = 0; i < X; i++) {
            if(sum + 4 <= Y){
                sum += 4;
            }else{
                sum += 2;
            }
            if(sum == Y){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
