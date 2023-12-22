import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StringBuilder s = new StringBuilder(scanner.nextLine());
        s.append(s);
        String p = scanner.nextLine();

        if(!s.toString().contains(p)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

        scanner.close();
    }
}

