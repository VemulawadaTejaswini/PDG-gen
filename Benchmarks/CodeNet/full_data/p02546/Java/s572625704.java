import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        if(input.endsWith("s")){
            System.out.println(input + "es");
        }else{
            System.out.println(input+"s");
        }

    }

}
