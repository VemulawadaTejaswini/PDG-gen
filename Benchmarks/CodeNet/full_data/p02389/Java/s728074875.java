import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
            if(b >= 1 && b <=100 && a>=1 &&a<=100){
                System.out.println((a*b) + " " + 2*(a+b));
            } else{
                System.out.println("The integer a,b should be from 1 to 100.");
            }
    }
}
