import java.util.Scanner;

public class Main {
    private static boolean IsValid(String password){
        if (password.length() < 6) {
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        return password.matches(".*[a-z].*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        while(sc.hasNext()) {
            password = sc.nextLine();
            if(IsValid(password)) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
