import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        int amountOfBlackSquares;
        int need = 0;

        rows = sc.nextInt();
        columns = sc.nextInt();
        amountOfBlackSquares = sc.nextInt();

        if (amountOfBlackSquares < rows && amountOfBlackSquares % rows >= 0) {
            need = amountOfBlackSquares / columns;
        } else if (amountOfBlackSquares < columns && amountOfBlackSquares % columns > 0) {
            need = amountOfBlackSquares / rows;
        } else if (amountOfBlackSquares > rows && amountOfBlackSquares % rows >= 0) {
            need = amountOfBlackSquares / columns;
        } else if (amountOfBlackSquares > columns && amountOfBlackSquares % columns > 0) {
            need = amountOfBlackSquares / rows;
        }
        else if (amountOfBlackSquares == rows) {
            need = 1;
        }
        else if (amountOfBlackSquares == columns) {
            need = 1;
        }
        System.out.println(need);
    }
}