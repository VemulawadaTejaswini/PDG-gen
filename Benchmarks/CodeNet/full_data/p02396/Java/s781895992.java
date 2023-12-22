import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int i = 0;
        
        do {
            int n = 1;
            i = stdIn.nextInt();
            System.out.println("case "+n+": "+i);
            n++;
        } while(i != 0);
    }
}