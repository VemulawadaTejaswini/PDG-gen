import java.util.Scanner;

class Main {
        public static void main(String[] args){
                Scanner stdIn = new Scanner(System.in);
                System.out.print("the number of x is ");
                int x = stdIn.nextInt();
                System.out.println((int)Math.pow(x, 3));
        }
}