import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine())
            sb.append(sc.nextLine());
        if (sb.equals("ARC")) {
            System.out.println("ABC");
        }
        if (sb.equals("ARC")) {
            System.out.println("ARC");
        }
    }
}
