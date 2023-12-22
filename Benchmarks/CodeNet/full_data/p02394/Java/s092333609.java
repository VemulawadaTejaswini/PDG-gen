import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int w = stdIn.nextInt();
        int h = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        int r = stdIn.nextInt();
        
        if ((x > r) && (x < (h-r)) && (y > r) && (y < (w-r))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}