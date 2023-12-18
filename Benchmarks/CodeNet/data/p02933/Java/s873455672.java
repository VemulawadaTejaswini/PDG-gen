import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        System.out.println(a >= 3200 ? s : "red");
    }

}
