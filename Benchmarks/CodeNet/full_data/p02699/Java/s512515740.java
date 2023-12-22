import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();

        if(W >= S){
            System.out.println("Unsafe");
        } else {
            System.out.println("Safe");
        }

        
        scanner.close();
    }

}