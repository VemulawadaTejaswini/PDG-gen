import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputKX = scan.nextLine().split(" ");
        Integer k = Integer.valueOf(inputKX[0]);
        Integer x = Integer.valueOf(inputKX[1]);

        for(Integer i=x-k-1; i<x+k-1; i++) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
        scan.close();
    }
}