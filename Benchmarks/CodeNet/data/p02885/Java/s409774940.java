import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());

        int unhide = A - B * 2;

        if(unhide < 0) {
            unhide = 0;
        }
        
        System.out.println(unhide);

        scanner.close();
    }
}