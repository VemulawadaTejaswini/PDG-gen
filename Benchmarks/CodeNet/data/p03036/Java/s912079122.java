import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int r = stdIn.nextInt();
        int D = stdIn.nextInt();
        int x2000 = stdIn.nextInt();

        int i=1;
        for(; i<=10; i++){
            System.out.println(x2000 = r * x2000 - D);
        }
    }
}