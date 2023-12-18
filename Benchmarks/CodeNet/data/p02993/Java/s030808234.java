import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int N = stdIn.nextInt();
        String n = String.valueOf(N);
        if (n.charAt(0) == n.charAt(1) || n.charAt(1) == n.charAt(2) || n.charAt(2) == n.charAt(3))
            System.out.print("Bad");
        else
            System.out.print("Good");
    }
}