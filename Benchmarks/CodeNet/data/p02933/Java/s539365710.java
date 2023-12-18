import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int paramA = Integer.parseInt(scanner.nextLine());
        String paramS = scanner.nextLine();
        scanner.close();
        if (paramA > 3200) {
            System.out.println(paramS);
        } else {
            System.out.println("red");
        }
    }
}