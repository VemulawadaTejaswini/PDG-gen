import java.util.Scanner;

public class Miain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int remind = 16  - (a + b);
        remind += Math.abs(a - b);
        remind = remind / 2;
        if (Math.abs(a - b) <= remind){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
    }
}
